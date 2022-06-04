package strategyPattern;

import strategyPattern.sorting.BubbleSorting;
import strategyPattern.sorting.SelectionSorting;
import strategyPattern.sorting.Sorting;

public class Cilent {

    public static Sorting selectSorting(String select) {

        if (select.equals("select")) {
            return new SelectionSorting();
        } else if (select.equals("bubble")) {
            return new BubbleSorting();
        }
        return null;
    }
}
