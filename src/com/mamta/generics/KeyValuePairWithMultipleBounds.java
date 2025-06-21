package com.mamta.generics;

import java.math.BigDecimal;


public class KeyValuePairWithMultipleBounds<K extends Number & Comparable<K>,V> {

    // K extends NUmber is the first bound and implements Comparable<K> is the secon
    private final K key;
    private final V value;
    public KeyValuePairWithMultipleBounds(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }


    // comparison of one key to the another
    public boolean keyGreaterThan(KeyValuePairWithMultipleBounds<K,V> key) {
        K otherKey = key.getKey();
        return this.key.compareTo(otherKey) > 0 ;
    }

    public static void main(String[] args) {
        // Full declaration
        KeyValuePairWithMultipleBounds<Integer,String> pair = new KeyValuePairWithMultipleBounds<Integer,String>(1,"hello");

        // Using diamond operator
        KeyValuePairWithMultipleBounds<Integer,String> pair2 = new KeyValuePairWithMultipleBounds<>(2,"Hi");

        // Using the var syntax (only for local variables)

        var pair3 = new KeyValuePairWithMultipleBounds<>(2,"hello");

        // Using the RAW type
        KeyValuePairWithMultipleBounds pair4 = new KeyValuePairWithMultipleBounds<>(1,"New York");


        KeyValuePairWithMultipleBounds<Integer,String> apple = new KeyValuePairWithMultipleBounds<>(2,"apple");
        KeyValuePairWithMultipleBounds<Integer,String> orange = new KeyValuePairWithMultipleBounds<>(3,"orange");

        System.out.println("Apple > Orange : " + apple.keyGreaterThan(orange));

        var apple1 = new KeyValuePairWithMultipleBounds<>(BigDecimal.valueOf(22.1),"Apple");
        var orange1 = new KeyValuePairWithMultipleBounds<>(BigDecimal.valueOf(2.1),"orange");

        System.out.println("Apple > Orange : " + apple1.keyGreaterThan(orange1));

        // Because it does implements comparable
//        var pairN = new KeyValuePairWithMultipleBounds<>(new AtomicLong(1000L),"Apple");


    }
}
