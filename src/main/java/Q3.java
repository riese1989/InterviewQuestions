import lombok.extern.java.Log;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log
public class Q3 {
    public static void main(String... args) {
        final String separator = Pattern.quote(System.getProperty("path.separator"));
        final Map<String, Function<String, String>> source = new LinkedHashMap<>();
        source.put("LD_LIBRARY_PATH", System::getenv);
        source.put("java.library.path", System::getProperty);
        source.put("java.class.path", System::getProperty);

        final Map<String, Set<Path>> environment = source.entrySet().stream() // преобразуем source в stream
                .collect(Collectors.toMap( //преобразуем в коллекцию
                        entry -> entry.getKey(), //в качестве ключа используется ключ source, 24 строка - значение
                        entry -> Optional.ofNullable(entry.getValue()) //возвращаем Optional, если нет, то null
                                .map(value -> value.apply(entry.getKey())) //кладём в value key
                                .map(value -> Pattern.compile(separator).splitAsStream(value)) //разбиваем сепаратором value
                                .orElseGet(Stream::empty) //если объект null, то возвращается пустой stream
                                .map(path -> Paths.get(path).toAbsolutePath()) //путь преобразуется в абсолютный
                                .collect(Collectors.toCollection(TreeSet::new)), //преобразуем в коллекцию
                        (u, v) -> {
                            throw new IllegalStateException(String.format("Duplicate key %s", u));
                        }, //
                        LinkedHashMap::new) //создаём двусвязный список
                );

        log.info(environment.toString());
    }

}
