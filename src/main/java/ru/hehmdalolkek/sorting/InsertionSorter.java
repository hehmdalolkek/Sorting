package ru.hehmdalolkek.sorting;

/**
 * The class implements the insertion sort algorithm.
 * The array is iterated over from left to right,
 * comparing each element to all previous elements
 * and placing it in a suitable position among the previously ordered elements.
 * This continues until the input data set is exhausted.
 * Sorting time - O(n2).
 *
 * @author Inna Badekha
 */
public class InsertionSorter implements Sorter {

    /**
     * Sorts the {@code int} array by insertion sort and returns the new sorted array.
     *
     * @param array the array to sort
     * @return new sorted array
     */
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();

        for (int i = 1; i < result.length; i++) {
            int number = result[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (number < result[j]) {
                    result[j + 1] = result[j];
                } else {
                    break;
                }
            }
            result[j + 1] = number;
        }

        return result;
    }
}
