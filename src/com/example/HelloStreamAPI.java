package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class HelloStreamAPI {

    public static void main(String[] args) {

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        // fluent API
        myList
                .stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // intermediate operations

        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // map
        List<Integer> square = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        // filter
        List<String> result = names.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        // sorted
        List result2 = names.stream()
                .sorted()
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        // terminal operations

        // collect
        Set<Integer> square2 = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        square2.forEach(System.out::println);

        // forEach
        number.stream()
                .map(x -> x * x)
                .forEach(y -> System.out.println(y));

        // reduce
        int even = number.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println(even);

        int acc = 0;
        for (Integer x : number) {
            if (x % 2 == 0) {
                acc = acc + x;
            }
        }
        System.out.println(acc);

        // a more complex example

        Map<Integer, String> map = new HashMap<>();
        Random random = new Random();
        for(int count = 1; count <= 10; count++) {
            map.put(random.nextInt(1000), UUID.randomUUID().toString());
        }
        map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ", " + e.getValue()));



    }
}
