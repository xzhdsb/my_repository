package generic_paradigm;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zihao.Xu
 * @version 1.0
 */
public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("三国演义");
        strings.add("水浒传");
        strings.add("红楼梦");

        //因为LinkedList是List接口的实现类
        //并且List是有序，可重复的
        //所以所有实现了List接口的实现类都可以通过 迭代器 增强for 普通for+索引 三种方式进行遍历

//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (String str:strings
//             ) {
//            System.out.println(str);
//        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
