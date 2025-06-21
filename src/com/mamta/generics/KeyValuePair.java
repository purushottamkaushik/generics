package com.mamta.generics;

public class KeyValuePair<K,V> {

    private final K key;
    private final V value;
    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Full declaration
        KeyValuePair<Integer,String> pair = new KeyValuePair<Integer,String>(1,"hello");

        // Using diamond operator
        KeyValuePair<Integer,String> pair2 = new KeyValuePair<>(2,"Hi");

        // Using the var syntax (only for local variables)

        var pair3 = new KeyValuePair<>(2,"hello");

        // Using the RAW type
        KeyValuePair pair4 = new KeyValuePair<>(1,"New York");


    }
}
