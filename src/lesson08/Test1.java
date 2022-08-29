package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {
        int[] num = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 1000;
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < num.length; j++) {
            if (max < num[j]) {
                max = num[j];
            }
            if (min > num[j]) {
                min = num[j];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

