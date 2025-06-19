package com.mamta.generics.records;

import java.util.Arrays;
import java.util.List;

public class NestedRecords {

    public static void main(String[] args) {

    }

    List<String> getData(){

        record MerchantSales(String firstName, String lastName){

        }

        return List.copyOf(Arrays.asList("Merchant Sales", "Merchant Sales 2"));
    }
}
