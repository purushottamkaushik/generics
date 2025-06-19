package com.mamta.generics;


public class BoundedTypeParameters<T extends Number> {

    private final T first;
    private final T second;

    public BoundedTypeParameters(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public double getSum() {
        return first.doubleValue() + second.doubleValue();
        // we can use methods of class from where we extends

    }

    public static void main(String[] args) {
        var pair = new BoundedTypeParameters(12,23.3);
        System.out.println(pair.getSum());
    }
}
