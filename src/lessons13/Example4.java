package lessons13;

import java.util.HashSet;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        set.add(25);
        set.add(11);
        set.add(6);
        set.add(3);
        set.add(24);

        for (Integer i : set) {
            if (i > 10) {
                set1.add(i);
            }
        }
        set.removeAll(set1);
        System.out.println(set);
    }
}
