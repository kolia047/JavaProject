package losson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num > 0) {
            System.out.println(num * 2);
        } else {
            System.out.println(num + 10);
        }
    }
}
