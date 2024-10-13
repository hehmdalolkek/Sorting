package ru.hehmdalolkek.sorting;

/**
 * The class implements the selection sort algorithm.
 * The number of the minimum value in the current list is searched for.
 * This value is exchanged with the value of the first unsorted position.
 * The tail of the list is sorted, excluding already sorted elements from consideration.
 * Sorting time - O(n2).
 *
 * @author Inna Badekha
 */
public class SelectionSorter implements Sorter {

    /**
     * Sorts the {@code int} array by selection sort and returns the new sorted array.
     *
     * @param array the array to sort
     * @return new sorted array
     */
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();

        for (int i = 0; i < result.length - 1; i++) {
            int indexOfMinValue = i;
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < result[indexOfMinValue]) {
                    indexOfMinValue = j;
                }
            }
            int temp = result[i];
            result[i] = result[indexOfMinValue];
            result[indexOfMinValue] = temp;
        }

        return result;
    }
}
