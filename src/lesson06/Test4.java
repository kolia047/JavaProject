package lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) throws IOException {

        System.out.println(max(initializeArray()));



    }

    static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(reader.readLine());

        }
        return nums;
    }

    static int max(int[] array) {
        Arrays.sort(array);

        int max = array[array.length-1];
        return max;
    }
}

