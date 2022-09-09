package lessons13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exampl2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Первое значение", "Яблоко");
        map.put("Второе значение", "Арбуз");
        map.put("Третье значение", "Помидор");
        printKeys(map);
    }

    static void printKeys(Map<String, String> map) {
        for (Map.Entry<String, String> key : map.entrySet()) {
            System.out.println(key.getKey());
        }
    }
}
