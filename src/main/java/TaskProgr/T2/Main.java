package TaskProgr.T2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hashtable properties = System.getProperties();
        Iterator it = properties.entrySet().iterator();
        TreeMap<String, String> treeMap = new TreeMap<>();
        while (it.hasNext())    {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            treeMap.put(entry.getValue(), entry.getKey());
        }
        Iterator itTreeMap = treeMap.entrySet().iterator();
        while (itTreeMap.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) itTreeMap.next();
            System.out.println(entry.getValue() + "....." + entry.getKey());
        }
    }
}
