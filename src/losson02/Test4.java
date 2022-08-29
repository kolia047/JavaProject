package losson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи первое число: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введи второе число: ");
        int b = Integer.parseInt(reader.readLine());
        if (a > b) {
            System.out.println("Максимальное: " + a);
        } else {
            System.out.println("Максимальное: " + b);
        }
    }
}
