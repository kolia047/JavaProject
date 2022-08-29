package losson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи строку: ");
        String str = reader.readLine();
        System.out.println("Введи число: ");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Ты ввел: " + str + " и " + num);
    }
}
