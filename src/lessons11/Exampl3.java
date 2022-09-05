package lessons11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exampl3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи числа: ");
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();
        System.out.println("Введи строки: ");
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            list.add(list.remove(0));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
