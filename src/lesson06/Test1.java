package lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[5];
        for (int i = 0; i < 5; i++) {
            strings[i] = reader.readLine();

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);

        }
    }
}
