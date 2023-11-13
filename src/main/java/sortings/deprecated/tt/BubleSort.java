package sortings.deprecated.tt;


import static sortings.deprecated.tt.SortingUtils.swap;

public class BubleSort implements Sorting {
    @Override
    public <E extends Comparable<E>> E[] sort(E[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].compareTo(array[j])>0){
                    swap(array,i,j);
                }
            }
        }
        return array;
    }
}
