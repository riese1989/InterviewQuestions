package SQL.NameFamily;

import java.util.Arrays;
import java.util.List;

public class Female {
    private List<String> name = Arrays.asList("Алиса", "Екатерина", "Елена", "Ирина", "Оксана");
    private List<String> family = Arrays.asList("Кузнецова", "Латынина", "Охтина", "Залучная", "Гулагова");

    public List<String> getName() {
        return name;
    }

    public List<String> getFamily() {
        return family;
    }

    public String getNameId(int id) {
        return name.get(id);
    }
    public String getFamilyId(int id) {
        return family.get(id);
    }
}
