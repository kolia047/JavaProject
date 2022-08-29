package lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws IOException {
        printArray(initializeArray());


    }

    static String[] initializeArray() throws IOException {
        String[] strings = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();

        }
        return strings;
    }

    static void printArray(String[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);

        }
    }
}
