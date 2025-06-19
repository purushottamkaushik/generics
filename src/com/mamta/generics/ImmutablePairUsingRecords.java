package com.mamta.generics;

public record ImmutablePairUsingRecords<T>(T first, T second) {

    // additional methods when needed can be added.

    public static void main(String[] args) {
        ImmutablePairUsingRecords<String> records =
                new ImmutablePairUsingRecords<>("Apple","banana");

        System.out.println(records.first);
        System.out.println(records.second);
    }
}

//
//Recall that for a record, the compiler will automatically create the necessary constructor, the accessor
//
//methods, and in fact it will also create the two string method, the equals method, and also the hashCode
//
//method.
//
//So only methods that you require can be put into the block of the record.
//
//And then you also see the way to create and access the methods are shown as well.
//
//One thing to note here is that the accessor methods do not have the get in front of the methods.
//
//        Of course, also there will be no setter methods because the record is immutable.
//
//But apart from all of these, using generics in a record is very similar to using generics in a class.