package org.example.example5_methods;

import java.util.ArrayList;
import java.util.List;

public class Tmethods2 {

    public static class Util{

        public static <T> T getValue(Object obj){
            return (T) obj; // ПРИВЕДЕНИЕ ТИПА
        }

        public static <T> T getValue(Object obj, Class<T> clazz){
            return (T) obj; //
        }

        public static void main(String[] args) {

            List list = new ArrayList();
            list.add("Author");
            list.add("Book");

            for (Object element : list) {
                System.out.println(Util.<String>getValue(element));

                String data = Util.getValue(element, String.class);
                System.out.println(data);

            }



        }

    }

}
