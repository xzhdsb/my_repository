package set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
//        new TreeSet<String>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        TreeSet<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("zb");
        strings.add("xzh");
        strings.add("dfsm");


        for (String s:strings
             ) {
            System.out.println(s);
        }
    }
}
