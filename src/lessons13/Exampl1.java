package lessons13;

import java.util.HashMap;
import java.util.Map;

public class Exampl1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ключ1", "Значение 1");
        map.put("Ключ2", "Значение 2");
        map.put("Ключ3", "Значение 3");
        map.put("Ключ4", "Значение 4");

        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " - " + s.getValue());
        }
    }
}

