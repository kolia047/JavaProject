package lessons12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.
public class Exampl2 {
    public static void main(String[] args) throws IOException {
        String[] str = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи 5 стро: ");
        for (int i = 0; i < 5; i++) {
            str[i] = reader.readLine();
        }
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        for(String s : str){
            System.out.println(s);
        }
    }
}