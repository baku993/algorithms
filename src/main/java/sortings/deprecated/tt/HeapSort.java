package sortings.deprecated.tt;

public class HeapSort implements Sorting {

    @Override
    public <E extends Comparable<E>> E[] sort(E[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            SortingUtils.swap(array, i, 0);
            heapify(array, i, 0);
        }
        return array;
    }

    private static <E extends Comparable<E>> void heapify(E[] array, int unsortedLength, int nodeId) {
        int leftNodePos = 2 * nodeId + 1;
        int rightNodePos = 2 * nodeId + 2;
        int smallestNodePosition = nodeId;
        if (leftNodePos < unsortedLength && array[leftNodePos].compareTo(array[smallestNodePosition]) < 0) {
            smallestNodePosition = leftNodePos;
        }

        if (rightNodePos < unsortedLength && array[rightNodePos].compareTo(array[smallestNodePosition]) < 0) {
            smallestNodePosition = rightNodePos;
        }

        if (smallestNodePosition != nodeId) {
            SortingUtils.swap(array, smallestNodePosition, nodeId);
            heapify(array, unsortedLength, smallestNodePosition);
        }
    }

}
