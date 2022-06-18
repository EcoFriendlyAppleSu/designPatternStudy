package strategyPattern.sorting;

import java.util.Arrays;


public class BubbleSortingEnt implements SortingEnt {
    @Override
    public void executeSorting(int[] ary) {
        System.out.println("Bubble sorting is running");
        bubbleSort(ary, ary.length);
        System.out.println(Arrays.toString(ary));
    }

    private void bubbleSort(int[] ary, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (ary[j] > ary[j + 1]) {
                    int temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }
    }

}
