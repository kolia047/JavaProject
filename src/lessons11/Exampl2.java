package lessons11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exampl2 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи 5 чисел: ");
        for (int j = 0; j < 5; j++) {
            int i = Integer.parseInt(reader.readLine());
            list.add(i);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}

