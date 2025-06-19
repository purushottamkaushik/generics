package com.mamta.generics;

public class GenericType<T> {

    // both members are having a T as a type
    private final T first;
    private final T second;
    public GenericType(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public static void main(String[] args) {

        GenericType<String> genericType = new GenericType<String>("Apple", "Banana");
        System.out.println(genericType.getFirst()); // No need of type casting
        System.out.println(genericType.getSecond());

        GenericType<Integer>  integerGenericType = new GenericType<Integer>(1,2);
        System.out.println(integerGenericType.getFirst());
        System.out.println(integerGenericType.getSecond());


        GenericType<Double> doubleGenericType = new GenericType<>(1.0,2.0);
        System.out.println(doubleGenericType.getFirst());
        System.out.println(doubleGenericType.getSecond());


        GenericType<Object> objectGenericType = new GenericType<Object>("Apple", "Banana");
        System.out.println(objectGenericType.getFirst());
    }
}
