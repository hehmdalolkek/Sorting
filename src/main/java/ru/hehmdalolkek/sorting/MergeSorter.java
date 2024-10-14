package ru.hehmdalolkek.sorting;

import java.util.Arrays;

/**
 * The class implements the merge sort algorithm.
 * Divides an array into subarrays,
 * sorts each of them, and then merges the sorted subarrays to produce a sorted array.
 * Sorting time - O(nlog n).
 *
 * @author Inna Badekha
 */
public class MergeSorter implements Sorter {

    /**
     * Sorts the {@code int} array by merge sort and returns the new sorted array.
     *
     * @param array the array to sort
     * @return new sorted array
     */
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();
        innerSort(result, 0, result.length - 1);
        return result;
    }

    /**
     * Splits an array into pieces. Then calls the sort function of the array pieces and merges them.
     *
     * @param array the array to sort
     * @param start array start index
     * @param end array end index
     */
    private void innerSort(int[] array, int start, int end) {
        if (start < end) {
            int middle = start + (end - start) / 2;
            innerSort(array, start, middle);
            innerSort(array, middle + 1, end);
            mergeSort(array, start, middle, end);
        }
    }

    /**
     * Splits an array into two arrays, then merges them into one sorted array.
     *
     * @param array the array to sort
     * @param start array start index
     * @param mid array middle index
     * @param end array end index
     */
    private void mergeSort(int[] array, int start, int mid, int end) {
        int[] leftArray = Arrays.copyOfRange(array, start, mid + 1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, end + 1);

        int resultArrayIndex = start;
        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
            if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
                array[resultArrayIndex] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                array[resultArrayIndex] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
            resultArrayIndex++;
        }

        while (leftArrayIndex < leftArray.length) {
            array[resultArrayIndex] = leftArray[leftArrayIndex];
            leftArrayIndex++;
            resultArrayIndex++;
        }

        while (rightArrayIndex < rightArray.length) {
            array[resultArrayIndex] = rightArray[rightArrayIndex];
            rightArrayIndex++;
            resultArrayIndex++;
        }
    }
}
