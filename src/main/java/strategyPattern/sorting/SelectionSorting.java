package strategyPattern.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSorting implements Sorting{
    @Override
    public void executeSorting(int[] ary) {
        System.out.println("Hello Im SelectSorting");
        selectSort(ary, ary.length);
        System.out.println(Arrays.toString(ary));
    }

    private void selectSort(int[] ary, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (ary[i] > ary[j]) {
                    int temp = ary[j];
                    ary[j] = ary[i];
                    ary[i] = temp;
                }
            }
        }
    }
}
