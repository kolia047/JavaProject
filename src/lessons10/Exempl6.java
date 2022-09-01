package lessons10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exempl6 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи 5 стро: ");
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        doubleValues(list);
    }
    static void doubleValues(List<String> list){
        List<String> list1 = new ArrayList<>();
        for(String s : list){
            list1.add(s);
            list1.add(s);
            System.out.print(s + " ");
            System.out.println(s);
        }
    }
}
