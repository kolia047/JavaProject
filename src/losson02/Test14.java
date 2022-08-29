package losson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        boolean i = true;
        while (i) {
            int num = Integer.parseInt(reader.readLine());
            sum = sum + num;
            if (num == -1) {
                i = false;
                System.out.println(sum);
            }
        }
    }
}
