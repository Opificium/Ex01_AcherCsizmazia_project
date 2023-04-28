// SOLUTION
package de.unistuttgart.dsass2023.ex01.p5;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractSortCheckerList<T extends Comparable<T>> implements ISimpleList<T> {
    private final List<T> list;

    public AbstractSortCheckerList() {
        this.list = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public void append(final T element) {
        list.add(element);
    }

    @Override
    public T getElement(final int index) {
        return list.get(index);
    }

    @Override
    public void swapElements(final int i, final int j) {
        T tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

    public List<T> getList() {
        return list;
    }
}
