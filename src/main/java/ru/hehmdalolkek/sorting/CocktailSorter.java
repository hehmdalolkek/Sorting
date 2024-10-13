package ru.hehmdalolkek.sorting;

/**
 * The class implements the cocktail sort algorithm.
 * The algorithm is an improved version of bubble sort.
 * The boundaries of the working part of the array are set at the location of the last exchange at each iteration.
 * The array is viewed alternately from right to left and from left to right.
 * Sorting time - O(n2).
 *
 * @author Inna Badekha
 */
public class CocktailSorter implements Sorter {

    /**
     * Sorts the {@code int} array by cocktail sort and returns the new sorted array.
     *
     * @param array the array to sort
     * @return new sorted array
     */
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();

        boolean isSorted = false;
        int left = 0;
        int right = result.length - 1;
        while(!isSorted && left < right) {
            isSorted = true;

            for (int i = left; i < right; i++) {
                if (result[i] > result[i + 1]) {
                    isSorted = false;
                    int temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (result[i] < result[i - 1]) {
                    isSorted = false;
                    int temp = result[i];
                    result[i] = result[i - 1];
                    result[i - 1] = temp;
                }
            }
            left++;
        }

        return result;
    }
}
