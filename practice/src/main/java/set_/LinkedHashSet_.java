package set_;

import java.util.LinkedHashSet;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        integers.add(5);
        integers.add(2);
        integers.add(2);
        integers.add(1);
        System.out.println(integers);
    }
}
