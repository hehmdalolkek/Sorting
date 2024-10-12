package ru.hehmdalolkek;

import java.util.Random;

/**
 * This class contains various methods for manipulating arrays.
 *
 * @author Inna Badekha
 */
public class ArrayUtil {

    /**
     * Instance of {@code Random} for generation.
     */
    private final static Random RANDOM = new Random();

    /**
     * Generates a random array of elements from 0 to {@code size + 1} of length {@code size}.
     *
     * @param size the length of the array to be generated
     * @return generated array
     */
    public static int[] generate(int size) {
        return RANDOM.ints(size, 0, size + 1)
                .toArray();
    }

    /**
     * Checks if the array is sorted correctly.
     *
     * @param array the array to check
     * @return {@code true} if the array is correctly sorted
     */
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
