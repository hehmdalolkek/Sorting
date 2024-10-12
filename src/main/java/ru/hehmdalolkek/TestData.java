package ru.hehmdalolkek;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a container of initial data for testing.
 * It contains the initial size of arrays,
 * the expected number of arrays, and the generated arrays.
 *
 * @author Inna Badekha
 */
public class TestData {

    /**
     * Length of the first array to generate.
     */
    private final int initialArraySize;

    /**
     * Number of arrays to generate.
     */
    private final int countOfArrays;

    /**
     * The {@code List} contains generated arrays based on data
     * from {@code initialArraySize} and {@code countOfArrays}.
     */
    private final List<int[]> arrays;

    /**
     * Creates TestData based on {@code initialArraySize} and {@code countOfArrays}.
     * Initializes {@code initialArraySize} and {@code countOfArrays} and generates {@code arrays},
     * increasing each subsequent array by 10.
     *
     * @param initialArraySize length of the first array to generate
     * @param countOfArrays number of arrays to generate
     */
    public TestData(final int initialArraySize, final int countOfArrays) {
        this.initialArraySize = initialArraySize;
        this.countOfArrays = countOfArrays;

        this.arrays = new ArrayList<>();
        int currentArraySize = initialArraySize;
        for (int i = 0; i < countOfArrays; i++) {
            arrays.add(ArrayUtil.generate(currentArraySize));
            currentArraySize *= 10;
        }
    }

    public int getInitialArraySize() {
        return this.initialArraySize;
    }

    public int getCountOfArrays() {
        return this.countOfArrays;
    }

    public List<int[]> getArrays() {
        return this.arrays;
    }

}
