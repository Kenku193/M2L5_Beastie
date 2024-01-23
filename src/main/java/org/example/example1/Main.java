package org.example.example1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(1); // index 0
        arrayList.add("один"); // index 1 - String!!!
        arrayList.add(true); // index 2

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        System.out.println("-".repeat(100));

        // X instanceof Y
        System.out.println("instanceof");
        System.out.println(arrayList.get(0) instanceof Integer);
        System.out.println(arrayList.get(1) instanceof String);
        System.out.println(arrayList.get(2) instanceof Boolean);

        System.out.println(arrayList.get(0) instanceof Object);
        System.out.println(arrayList.get(1) instanceof Object);
        System.out.println(arrayList.get(2) instanceof Object);

        // Integer i = arrayList.get(0);
        Integer i = (Integer) arrayList.get(0);
        String  s = (String) arrayList.get(1);
        Boolean b = (Boolean) arrayList.get(2);

        Integer p = (Integer) arrayList.get(1); // String casting to Integer and nothing underwrite


    }
}