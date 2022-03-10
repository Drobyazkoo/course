package by.itland.itjava.drobyazko.lesson16;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<Double> set1 = new HashSet<>(){{
            add(5.0);
            add(3.0);
            add(1.0);
        }};
        Set<Double> set2 = new HashSet<>();
        set2.add(2.0);
        set2.add(3.0);
        set2.add(5.0);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(getCross(set1, set2));
        System.out.println(getUnion(set1, set2));
    }

    private static Set<Double> getUnion(Set<Double> set1, Set<Double> set2) {
        Set<Double> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    private static Set<Double> getCross(Set<Double> set1, Set<Double> set2) {
        Set<Double> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}
