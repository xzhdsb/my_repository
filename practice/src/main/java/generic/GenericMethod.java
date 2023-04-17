package generic;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericMethod {


    public static void main(String[] args) {

    }

    public <T> T printGenericType(T t){
        T tt = null;
        System.out.println(t.getClass());
        return t;
    }
}
