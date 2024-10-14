package ru.hehmdalolkek.sorting;

import java.util.Arrays;

/**
 * The class implements the dual-pivot quick sort algorithm.
 * Sorts the specified range of the array using parallel merge sort and/or Dual-Pivot Quicksort.
 * Sorting time - O(n log(n)).
 *
 * @author Inna Badekha
 */
public class DualPivotQuickSorter implements Sorter {

    /**
     * Sorts the {@code int} array by dual-pivot quick sort and returns the new sorted array.
     *
     * @param array the array to sort
     * @return new sorted array
     */
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();
        Arrays.sort(result);
        return result;
    }
}
