package lessons13;

import java.util.HashMap;
import java.util.Map;

public class Exampl5 {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();

        mapa.put("Петров", "Николай");
        mapa.put("Сидоров", "Николай");
        mapa.put("Иванов", "Петр");
        mapa.put("Путин", "Володя");
        mapa.put("Медведев", "Дмитрий");
        System.out.println(getCountTheSameFirstName(mapa, "Саша"));
        int num = getCountTheSameLastName(mapa, "Путин");
        System.out.println(num);
    }

    static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int counter = 0;
        for (Map.Entry<String, String> s : map.entrySet()) {
            if (s.getValue().equals(name)) {
                counter++;
            }
        }
        return counter;
    }

    static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int counter = 0;
        for (Map.Entry<String, String> s : map.entrySet()) {
            if (s.getKey().equals(lastName)) {
                counter++;
            }
        }
        return counter;
    }
}
