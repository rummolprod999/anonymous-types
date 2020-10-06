package com.benjiweber.anonymous;

import static java.lang.System.out;

interface Waddles {
    default void waddle() {
        out.println("Waddle");
    }
}
