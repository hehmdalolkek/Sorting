package ru.hehmdalolkek.sorting;

/**
 * The class implements the merge sort algorithm.
 * The pivot element is taken from the middle of the array.
 * The elements of the array are compared with the pivot element.
 * The numbers that are smaller than the pivot number are rearranged before it,
 * the numbers that are larger are rearranged after it.
 * The same process is performed recursively for the segments of "smaller" and "larger" values.
 * Sorting time (average) - O(n log(n)).
 *
 * @author Inna Badekha
 */
public class QuickSorter implements Sorter {

    /**
     * Sorts the {@code int} array by quick sort and returns the new sorted array.
     *
     * @param array the array to sort
     * @return new sorted array
     */
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();
        quickSort(result, 0, result.length - 1);
        return result;
    }

    /**
     * Sorts the array - {@code array} starting at index {@code start} and ending at {@code end} inclusive.
     * Sorts the array relative to a reference number, calling itself recursively.
     *
     * @param array the array to sort
     * @param start array start index (inclusive)
     * @param end array end index (inclusive)
     */
    private void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    /**
     * Takes the middle number as a pivot. Sorts the array relative to the pivot
     * (moves numbers smaller than the pivot to the left of it, numbers larger to the right).
     * Returns the index of the pivot.
     *
     * @param array the array to sort
     * @param start array start index (inclusive)
     * @param end array end index (inclusive)
     * @return index of the pivot
     */
    private int partition(int[] array, int start, int end) {
        int middle = start + (end - start) / 2;
        int pivot = array[middle];
        swap(array, middle, end);

        int index = (start - 1);
        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                index++;
                swap(array, index, j);
            }
        }

        swap(array, index + 1, end);
        return index + 1;
    }

    /**
     * Swaps the number with index {@code indexA} and the number with index {@code indexB}.
     *
     * @param array the array to swap
     * @param indexA index of the first number
     * @param indexB index of the second number
     */
    private void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
