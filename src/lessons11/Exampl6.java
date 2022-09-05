package lessons11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exampl6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи число: ");
        int n = Integer.parseInt(reader.readLine());
        int minimum = getMinimum(getIntegerList(n));
        System.out.println("Минимальное число: " + minimum);

    }

    static List<Integer> getIntegerList(int n) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>(n);
        System.out.println("Введи " + n + " цифр: ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader1.readLine()));
        }
        return list;
    }

    static int getMinimum(List<Integer> list) {
        int min = list.get(0);
        for (int n : list) {
            if (min > n) {
                min = n;
            }
        }
        return min;
    }
}
