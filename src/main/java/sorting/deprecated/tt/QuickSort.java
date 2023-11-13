package sorting.deprecated.tt;

import static sorting.deprecated.tt.SortingUtils.swap;

public class QuickSort implements Sorting {
    @Override
    public <E extends Comparable<E>> E[] sort(E[] array) {

        return quickSort(array, 0, array.length - 1);
    }

    public <E extends Comparable<E>> E[] quickSort(E[] array, int start, int finish) {
        if(start<finish){
            int pivotIndex = divide(array, start, finish);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, finish);
            return array;
        }
        return array;
    }

    private <E extends Comparable<E>> int divide(E[] array, int start, int end) {

        int pivotPos = start - 1;
        for (int i = start; i < end; i++) {
            if (array[i].compareTo(array[end]) > 0) {
                pivotPos++;
                swap(array, pivotPos, i);
            }
        }

        swap(array, pivotPos + 1, end);

        return pivotPos+1;
    }
}
