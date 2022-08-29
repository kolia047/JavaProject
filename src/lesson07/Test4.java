package lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[10];
        int[] ints1 = new int[5];
        int[] ints2 = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < ints.length; i++) {
            ints1[i] = ints[i];
            ints2[i] = ints[ints.length]/2;

        }
        System.out.println();
//        for (int i = ints.length/2; i < ints.length; i++) {
//            int iter = 0;
//            ints2[iter] = ints[i];
//            iter++;
//        }

        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);

        }
        for (int i = 0; i < ints2.length; i++) {
            System.out.println(ints2[i]);
        }
    }


}
