package lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
    public static void main(String[] args) throws IOException {
        String[] strings = new String[5];
        int[] ints = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
            ints[i] = strings[i].length();
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
