package generic_paradigm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zihao.Xu
 * @version 1.0
 */
public class Generic_ {
    public static void main(String[] args) {
        Integer i = 1;
        Integer i1 = 2;
        System.out.println(printSum(i , i1));

//        Map
    }

    //做一个泛型方法
    public static <T extends Number> Integer printSum(T t,T t1){
        int sum = t.intValue() + t1.intValue();
        return sum;
    }
}
