package org.example.example5_methods;

public class Tmethods<F, S> {

    public F first;
    public S second;

    public Tmethods(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public static void main(String[] args) {

        Tmethods<Integer, String> tmethods = new Tmethods<>(1, "fdss");
        Integer first1 = tmethods.getFirst();
        System.out.println(first1);

    }
}
