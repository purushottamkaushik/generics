package com.mamta.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericMethods {


    public static <T extends Number> double sum(List<T> elements) {
        double sum = 0;
        for (T element : elements) {
            sum += element.doubleValue();
        }
        return sum;
    }


    public static <K extends Number & Comparable<K>,V> Optional<KeyValuePair<K,V>> keyGreater(KeyValuePair<K,V> pair , KeyValuePair<K,V> pair2) {
        K key1 = pair.getKey();
        K key2 = pair2.getKey();
        int result = key1.compareTo(key2);
        if (result > 0) {
            return Optional.of(pair);
        }
        if (result < 0) {
            return Optional.of(pair2);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        double integerSum = sum(List.of(1, 2, 3));
        System.out.println(integerSum);
        double doubleSum = sum(List.of(1.0, 2.0, 3.0));
        System.out.println(doubleSum);
        double bigDecimalSum = sum(List.of(BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)));
        System.out.println(bigDecimalSum);



        var pair1 = new KeyValuePair<>(1,"Apple");
        var pair2 = new KeyValuePair<>(2,"Banana");
        keyGreater(pair1,pair2).ifPresent(System.out::println);

    }


}
