package SQL.NameFamily;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Male {
    private List<String> name = Arrays.asList("Василий", "Георгий", "Алексей", "Константин", "Афанасий");
    private List<String> family = Arrays.asList("Петров", "Сидоров", "Смирнов", "Васильев", "Алексеев");

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
