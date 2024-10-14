# Sorting

### Description

An application implementing some sorting algorithms.
A visual comparison of the execution speed of sorting algorithms is provided.

The application runs all types of sorting on generated arrays.
Arrays are generated with random numbers. 
Each subsequent generated array is 10 times longer than the previous one.
You can configure the number of arrays and the length of the first array.

The following algorithms are implemented:
* Bubble sort
* Cocktail sort
* Selection sort
* Insertion sort
* Merge sort
* Quick sort
* Dual-Pivot sort

### Run locally

To run it you need to have Maven installed locally, 
otherwise use the IntelliJ IDEA run.

1. You need to build the application using maven: 
    ```
    mvn package
    ```
2. You can run the application using the command line: 
    ```
    java -jar target/Sorting-1.0-SNAPSHOT.jar
    ```

3. (Optional) You can run the application with command-line args:
   1. Number of arrays.
   2. Length of the first array.
    ```
    java -jar target/Sorting-1.0-SNAPSHOT.jar 5 10
    ```