package TaskProgr.T3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class T3 {
    private static final String PATH_FILE = "src/main/java/TaskProgr/T3/test.txt";
    public static void main(String[] args) {
        String string = readFromFile();
        String[] arrayStrings = string.toLowerCase().split("'?(\\s|$)(?=(([^']*'){2})*[^']*$)'?");
        List arrayListString = Arrays.asList(arrayStrings);
        Set<String> set = new LinkedHashSet<>(arrayListString);
        System.out.println(arrayListString.size() - set.size());
    }

    private static String readFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_FILE));
            StringBuilder stringBuilder = new StringBuilder();
            int symbol = bufferedReader.read();
            while (symbol != -1) {
                stringBuilder.append((char) symbol);
                symbol = bufferedReader.read();
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }

}
