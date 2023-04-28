// SOLUTION
package de.unistuttgart.dsass2023.ex01.p5;


public class SelectionSortCheckerList<T extends Comparable<T>> extends AbstractSortCheckerList<T> {

    private final Object[] unsortedArray = {6, 0, 8, 3, 9, 2};
    private final Object[] sortedArray = {0, 2, 3, 6, 8, 9};

    public SelectionSortCheckerList() {
        for (int i = 0; i < unsortedArray.length; i++)
            append((T) unsortedArray[i]);
    }

    public Object[] getSortedArray() {
        return sortedArray;
    }
}
