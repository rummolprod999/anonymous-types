package com.benjiweber.anonymous;

import java.util.List;

import static com.benjiweber.anonymous.AnonymousTypes.with;
import static java.util.Arrays.asList;

public class EnhancingListExample {

    public static void main(String... args) {
        List<String> stringList = asList("alpha", "bravo");

        with((ForwardingList<String> & Mappable<String>) () -> stringList, list -> {
            List<String> strings = list.map(String::toUpperCase);
            strings.forEach(System.out::println);
        });
    }
}

