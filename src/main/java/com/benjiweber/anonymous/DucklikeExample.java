package com.benjiweber.anonymous;

import com.benjiweber.anonymous.AnonymousTypes.Anon;

import static com.benjiweber.anonymous.AnonymousTypes.with;
import static java.lang.System.out;

public class DucklikeExample {

    public static void main(String... args) {
        with((Anon & Quacks & Waddles) i -> i, ducklike -> {
            out.println(ducklike.getClass());
            ducklike.quack();
            ducklike.waddle();
        });

        doDucklikeThings((Anon & Quacks & Waddles) i -> i);
    }

    public static <Ducklike extends Quacks & Waddles> void doDucklikeThings(Ducklike ducklike) {
        out.println(ducklike.getClass());
        ducklike.quack();
        ducklike.waddle();
    }

    interface Quacks {
        default void quack() {
            out.println("Quack");
        }
    }

    interface Waddles {
        default void waddle() {
            out.println("Waddle");
        }
    }
}
