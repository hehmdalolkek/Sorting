package ru.hehmdalolkek.sorting;

/**
 * The class implements the bubble sort algorithm.
 * A number of passes through the array are performed - starting from the beginning of the array,
 * pairs of adjacent array elements are iterated.
 * If the 1st element of the pair is greater than the 2nd, the elements are swapped.
 * Pairs of array elements are iterated until the next pass reveals that no more swaps are required.
 * Sorting time - O(n2).
 *
 * @author Inna Badekha
 */
public class BubbleSorter implements Sorter {

    /**
     * Sorts the {@code int} array by bubble sort and returns the new sorted array.
     *
     * @param array the array to sort
     * @return new sorted array
     */
    @Override
    public int[] sort(int[] array) {
        int[] result = array.clone();

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    int temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

        return result;
    }

}
