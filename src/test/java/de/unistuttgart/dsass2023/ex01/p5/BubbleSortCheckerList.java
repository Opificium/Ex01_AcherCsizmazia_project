// SOLUTION
package de.unistuttgart.dsass2023.ex01.p5;

public class BubbleSortCheckerList<T extends Comparable<T>> extends AbstractSortCheckerList<T> {

    private final Object[] unsortedArray = {6, 0, 8, 3, 9, 2};
    private final Object[] sortedArray = {9, 8, 6, 3, 2, 0};

    public BubbleSortCheckerList() {
        for (int i = 0; i < unsortedArray.length; i++)
            append((T) unsortedArray[i]);
    }

    public Object[] getSortedArray() {
        return sortedArray;
    }
}
