package ru.hehmdalolkek.sorting;

/**
 * Sorting algorithm interface. Provides a method for sorting an array of {@code int}.
 *
 * @author Inna Badekha
 */
public interface Sorter {

    /**
     * Sorts the {@code int} array and returns the new sorted array.
     *
     * @param array the array to sort
     * @return new sorted array
     */
    int[] sort(int[] array);

}
