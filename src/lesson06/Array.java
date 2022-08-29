package lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] num= new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());


        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }

    }
}
