package org.example.example5_methods;

import java.util.Arrays;
import java.util.List;

public class Tmethods3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);

        Tmethods3.<Integer>doSomething(list.get(0));

    }

    private static <T> void doSomething(T obj){
        System.out.println(obj);
    }

}
