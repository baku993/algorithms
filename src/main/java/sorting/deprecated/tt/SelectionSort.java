package sorting.deprecated.tt;

import static sorting.deprecated.tt.SortingUtils.swap;

public class SelectionSort implements Sorting {
    @Override
    public <E extends Comparable<E>> E[] sort(E[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentMaxPos = i;
            for (int j = i; j < array.length; j++) {
                if (array[currentMaxPos].compareTo(array[j]) < 0) {
                    currentMaxPos = j;
                }
            }
            if (currentMaxPos != i) {
                swap(array, currentMaxPos, i);
            }
        }
        return array;

    }

}
