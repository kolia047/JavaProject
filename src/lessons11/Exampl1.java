package lessons11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exampl1 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки: ");
        String str = reader.readLine();
        while (!str.isEmpty()) {
            list.add(str);
            str = reader.readLine();
        }
        for (String s : list) {
            if (s.length() % 2 == 0) {
                list1.add(s);
                list1.add(s);
            } else {
                list1.add(s);
                list1.add(s);
                list1.add(s);
            }
        }
        System.out.println(list1);
    }
}
