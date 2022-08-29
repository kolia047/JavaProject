package losson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два числа: ");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        closeToFive(a, b);
    }

    static void closeToFive(int a, int b) {
        if (Math.abs(a - 5) < Math.abs(b - 5)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
