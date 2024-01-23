package org.example.example6_variants;

import java.util.Arrays;
import java.util.List;

public class Variants {
    public static void main(String[] args) {

        // КОВАРИАНТНОСТЬ
        // КОШКА <- ЖИВОТНОЕ
        // МНОГО КОШЕК <- МНОГО ЖИВОТНЫХ

        // КОНТРВАРИАНТНОСТЬ
        // МНОЖЕСТВО<КОШКИ> название = МНОЖЕСТВО<ЖИВОТНЫЕ>

        // ИНВАРИАНТНОСТЬ
        // КОШКА <- ЖИВОТНОЕ
        // МНОГО КОШЕК !<- МНОГО ЖИВОТНЫХ

        String[] strings = {"a", "b", "c"};
        Object[] obj = strings;

        obj[0] = 42 + "";

        List<Integer> list = Arrays.asList(7,8,9);
        List<? extends Number> numbers = list;

        for (Number number : numbers) {
            System.out.println(number);
        }


    }
}
