package lessons13;

import java.util.HashMap;
import java.util.Map;

public class Exampl3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ключ1", "Значени1");
        map.put("Ключ2", "Значени2");
        map.put("Ключ3", "Значени3");
        map.put("Ключ4", "Значени4");
        printValues(map);
    }

    static void printValues(Map<String, String> map) {
        for (Map.Entry<String, String> peir : map.entrySet()) {
            System.out.println(peir.getValue());
        }
    }
}
