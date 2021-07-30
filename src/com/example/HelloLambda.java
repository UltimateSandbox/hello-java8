package com.example;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class HelloLambda {

    // x -> x * 2
    public int doubleMe(int x) {
        return x * 2;
    }

    // Lambda types in Java
    // (java.util.function)

    // Predicate - takes 1 value returns boolean
    Predicate<Integer> predicate = p -> p == 2 ? true : false;

    // Function - takes 1 value returns 1 value
    Function<Integer, Integer> function = f -> f * 2;

    // Supplier - takes 0 values returns 1 value
    AtomicInteger value = new AtomicInteger(0);
    Supplier<Integer> supplier = () -> value.getAndIncrement();

    // Consumer - takes 1 value returns nothing
    Consumer<String> consumer = s -> System.out.println(s);

}
