package lessons11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exampl4 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи строки: ");
        String s = reader.readLine();

        while (!s.equals("end")) {
            list.add(s);
            s = reader.readLine();
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
