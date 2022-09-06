package lessons12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
public class Exampl1 {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи число 10 раз: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(nums);
        for (int i = (nums.length - 1); i >= nums.length / 2; i--) {
            System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));
    }
}
