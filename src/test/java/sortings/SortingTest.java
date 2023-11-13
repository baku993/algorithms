package sortings;

import org.junit.jupiter.api.Test;
import sorting.deprecated.tt.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SortingTest {


    @Test
    public void testSortAlgorithms() {
        Integer[] testArray = new Integer[]{5, 3, 10, 4, 6, 7, 3, 5, 6, 2, 3, 5, 6, 0, 7, -1};
        Sorting[] sortings = {new HeapSort(),
                new BubleSort(),
                new SelectionSort(),
                new InsertionSort(),
                new MergeSort(),
                new QuickSort()};
        for (Sorting sorting :
                sortings) {
            Integer[] copy = Arrays.copyOf(testArray, testArray.length);
            System.out.printf("%-20s -      %s%n", sorting.getClass().getSimpleName(),
                    Arrays.toString(sorting.sort(copy)));
            assertArrayEquals(copy, new Integer[]{10, 7, 7, 6, 6, 6, 5, 5, 5, 4, 3, 3, 3, 2, 0, -1});
        }
    }
}
