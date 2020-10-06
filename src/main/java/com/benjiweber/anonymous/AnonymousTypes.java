package com.benjiweber.anonymous;

import java.util.function.Consumer;

public class AnonymousTypes {
    public static <T extends Anon> void with(T t, Consumer<T> consumer) {
        consumer.accept(t);
    }

    public static <T, U extends DelegatesTo<T>> void with(U u, Consumer<U> consumer) {
        consumer.accept(u);
    }
}
