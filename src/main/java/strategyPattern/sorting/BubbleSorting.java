package strategyPattern.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BubbleSorting implements Sorting{
    @Override
    public void executeSorting(int[] ary) {
        System.out.println("Hello Im BubbleSorting" + ary.length);
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
