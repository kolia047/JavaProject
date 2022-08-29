package losson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a < b && a > c || a < c && a > b) {
            System.out.println(a);
        } else if (b < a && b > c || b < c && b > a) {
            System.out.println(b);

        } else {
            System.out.println(c);
        }
    }
}
