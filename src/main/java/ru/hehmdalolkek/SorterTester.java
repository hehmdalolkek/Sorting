package ru.hehmdalolkek;

import ru.hehmdalolkek.sorting.Sorter;

/**
 * A class that performs tests of array sorting algorithms.
 *
 * @author Inna Badekha
 */
public class SorterTester {

    /**
     * The data on which the tests are based.
     */
    private final TestData testData;

    /**
     * The sorting algorithm being tested.
     */
    private final Sorter sorter;

    /**
     * Creates a {@code SorterTester} based on the test data {@code TestData}
     * and the sorting algorithm {@code Sorter}.
     *
     * @param testData the data on which the tests are based
     * @param sorter the sorting algorithm being tested
     */
    public SorterTester(final TestData testData, Sorter sorter) {
        this.testData = testData;
        this.sorter = sorter;
    }

    /**
     * Runs testing and outputs results.
     * Tests the sorting algorithm {@code Sorter} on all arrays presented in {@code TestData}.
     * Measures the execution time of the testing algorithm.
     * Checks whether the sorting is performed correctly.
     */
    public void runTests() {
        System.out.printf("Sorter: %s\n", this.sorter.getClass().getSimpleName());

        for (int[] array : this.testData.getArrays()) {
            long start = System.currentTimeMillis();
            int[] sortedArray = this.sorter.sort(array);
            long end = System.currentTimeMillis();
            boolean isSorted = ArrayUtil.isSorted(sortedArray);

            System.out.printf("\tArray length: %d, time wasted: %d ms, correct sorting: %s\n",
                    array.length, end - start, isSorted);
        }
    }

}
