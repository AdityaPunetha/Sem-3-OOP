import java.util.*;

public class exp10_3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        HashSet<Integer> copyOfSet = new HashSet<>(set);
        System.out.println("Original HashSet: " + set);
        System.out.println("Copy HashSet: " + copyOfSet);
        copyOfSet.clear();
        System.out.println("Cleared set: " + copyOfSet);
        if (set.contains(10)) {
            System.out.println("The hashset contains key 10");
        } else {
            System.out.println("The hashset does not contains key 10");
        }
        if (set.contains(80)) {
            System.out.println("The hashset contains key 80");
        } else {
            System.out.println("The hashset does not contains key 80");
        }
    }
}
