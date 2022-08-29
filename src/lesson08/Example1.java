package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) throws IOException {
        int[] array1 = new int[10];
        int[] array2 = new int[5];
        int[] array3 = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < array1.length / 2; i++) {
            array2[i] = array1[i];
            array3[i] = array1[5 + i];
            System.out.println(array3[i]);
        }
    }
}
