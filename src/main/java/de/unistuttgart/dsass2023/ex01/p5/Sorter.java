package de.unistuttgart.dsass2023.ex01.p5;

import javax.naming.spi.DirStateFactory;
import javax.xml.transform.Result;

public class Sorter {



	/**
	 * Performs selection sort on provided list, works directly on list object,
	 * hence no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
		for (int i = 0; i < list.getSize() - 1; i++)
			for (int j = i + 1; j <list.getSize(); j++)
				if (Integer.signum(list.getElement(i).compareTo(list.getElement(j))) == 1)
					list.swapElements(i, j);
	}

	/**
	 * Performs insertion sort on provided list, works directly on list object,
	 * hence no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {
		Object store;
		for (int i = 1; i < list.getSize(); i++) {
			store = list.getElement(i);
			int pos = i;
			while (pos > 0 && Integer.parseInt(list.getElement(pos - 1).toString()) > Integer.parseInt(store.toString())){
				list.swapElements(pos, pos - 1);
				pos--;
			}
		}
	}

	/**
	 * Performs bubble sort on provided list, works directly on list object, hence
	 * no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		
	}
}

