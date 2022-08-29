package lesson06;

public class Test2 {
    public static void main(String[] args) {
        int[] num = new int[]{5, 20, 13, 24, 47};
        int summa = 0;
        for (int i = 0; i < num.length; i++) {
            summa = summa + num[i];

        }
        System.out.println(summa);
    }
}
