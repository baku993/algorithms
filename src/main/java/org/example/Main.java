package org.example;

import sorting.deprecated.tt.*;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer[] testArray = new Integer[]{5, 3, 10, 4, 6, 7, 3, 5, 6, 2, 3, 5, 6, 0, 7, -1};
        Sorting[] sortings = {new HeapSort(), new BubleSort(), new SelectionSort(), new InsertionSort()};
        for (Sorting sorting :
                sortings) {
            System.out.printf("%-20s - %s%n",sorting.getClass().getSimpleName(),
                    Arrays.toString(sorting.sort(Arrays.copyOf(testArray, testArray.length))));
        }
    }
}