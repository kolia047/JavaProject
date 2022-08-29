package losson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        int num = Integer.parseInt(reader.readLine());
        Test7.compare(num);

    }
    static void compare(int a) {
        if(a < 5) {
            System.out.println("Число меньше 5");
        } else if (a> 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }
    }
}
