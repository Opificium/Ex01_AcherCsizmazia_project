package de.unistuttgart.dsass2023.ex01.p5;

// START SOLUTION
// END SOLUTION

import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest<T> {
    @Test
    public void testSelectionSort() {
        SelectionSortCheckerList sortCheckerList = new SelectionSortCheckerList<>();
        Sorter.selectionSort(sortCheckerList);
        Object[] listAsSorted = sortCheckerList.getList().toArray(new Object[sortCheckerList.getSize()]);

        assertArrayEquals(sortCheckerList.getSortedArray(), listAsSorted);
    }

    @Test
    public void testInsertionSort() {
        InsertionSortCheckerList sortCheckerList = new InsertionSortCheckerList();
        Sorter.insertionSort(sortCheckerList);
        Object[] listAsSorted = sortCheckerList.getList().toArray(new Object[sortCheckerList.getSize()]);

        assertArrayEquals(sortCheckerList.getSortedArray(), listAsSorted);
    }

    @Test
    public void testBubbleSort() {
        BubbleSortCheckerList sortCheckerList = new BubbleSortCheckerList();
        Sorter.bubbleSort(sortCheckerList);
        Object[] listAsSorted = sortCheckerList.getList().toArray(new Object[sortCheckerList.getSize()]);

        assertArrayEquals(sortCheckerList.getSortedArray(), listAsSorted);
    }
}
