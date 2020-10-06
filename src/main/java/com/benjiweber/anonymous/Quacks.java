package com.benjiweber.anonymous;

import static java.lang.System.out;

interface Quacks {
    default void quack() {
        out.println("Quack");
    }
}
