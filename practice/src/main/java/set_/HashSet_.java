package set_;

import java.util.*;

/**
 * @author zihao.Xu
 * @version 1.0
 */

public class HashSet_ {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(9);
        integers.add(1);
        if (integers.contains(1)){
            for (Integer integer : integers) {
                if (integer == 1) {
                    System.out.println("此set集合有1这个元素");
                }
            }
        }

        //实验：数组如何转成list，通过Collections的addAll方法
//        String[] strs = new String[]{"dasd","sdsd","ddvv"};
//        ArrayList<String> strings = new ArrayList<>();
//        Collections.addAll(strings,strs);
//        for (String s:strings
//             ) {
//            System.out.println(s);
//        }

        HashSet<String> strings = new HashSet<>();
        strings.add(new String("Dog"));
        strings.add(new String("Dog"));
        System.out.println(strings);

        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(1);
        integers1.add(1);
        System.out.println(integers1);
    }
}
