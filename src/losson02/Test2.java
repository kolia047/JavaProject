package losson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println(str + " будет получать " + number1 + "$ через " + number2 + " лет.");

    }
}
