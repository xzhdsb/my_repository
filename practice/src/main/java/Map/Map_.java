package Map;

import java.util.*;

public class Map_ {
    public static void main(String[] args) {
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("徐子豪","王婉晨");
        stringMap.put("徐爱平","王淑琴");
        stringMap.put("邓超","孙俪");
        stringMap.put(null,"白敬亭");
        stringMap.put("鹿晗","关晓彤");

        System.out.println("第一种遍历方式---keyset-增强for");
        Set<String> strings = stringMap.keySet();
        for (String str:strings
             ) {
            System.out.println(str + "-" + stringMap.get(str));
        }

        System.out.println("第一种遍历方式---keyset-迭代器");
        Iterator<String> iterator = stringMap.keySet().iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            System.out.println(next + "-" + stringMap.get(next));
        }

    }
}
