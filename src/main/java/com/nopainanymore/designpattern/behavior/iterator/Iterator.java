package com.nopainanymore.designpattern.behavior.iterator;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * design-pattern: Iterator
 *
 * @author nopainanymore
 * @version 2019-11-11 15:18
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();

    boolean hasPrevious();

    E previous();

    int nextIndex();

    int previousIndex();

    void set(E e);

    void add(E e);

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext()) {
            action.accept(next());
        }
    }
}
