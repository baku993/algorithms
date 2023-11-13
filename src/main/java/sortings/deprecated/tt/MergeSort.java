package sortings.deprecated.tt;

public class MergeSort implements Sorting {
    @Override
    public <E extends Comparable<E>> E[] sort(E[] array) {

        return mergeSort(array, 0, array.length - 1);
    }

    public <E extends Comparable<E>> E[] mergeSort(E[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
        return array;
    }

    public <E extends Comparable<E>> void merge(E[] array, int left, int middle, int end) {

        int k = left;

        int sizeLeft = middle - left + 1;
        int sizeRigth = end - middle;

        E[] leftArray = (E[]) new Comparable[sizeLeft];
        System.arraycopy(array, left, leftArray, 0, sizeLeft);

        E[] rightArray = (E[]) new Comparable[sizeRigth];

        for (int j = 0; j < sizeRigth; j++) {
            rightArray[j] = array[j + middle + 1];
        }
        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft < sizeLeft && indexRight < sizeRigth) {
            if (leftArray[indexLeft].compareTo(rightArray[indexRight]) > 0) {
                array[k] = leftArray[indexLeft];
                indexLeft++;
            } else {
                array[k] = rightArray[indexRight];
                indexRight++;
            }
            k++;
        }

        while (indexLeft < sizeLeft) {
            array[k] = leftArray[indexLeft];
            indexLeft++;
            k++;
        }

        while (indexRight < sizeRigth) {
            array[k] = rightArray[indexRight];
            k++;
            indexRight++;
        }

    }
}
