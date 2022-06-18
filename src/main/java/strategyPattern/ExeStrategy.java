package strategyPattern;

import strategyPattern.sorting.SortingEnt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExeStrategy {
    public static void main(String[] args) throws IOException {

        Cilent cilent = new Cilent();

        int[] unsortedAry = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};

        SortingEnt sortingEnt = cilent.selectSorting();

        sortingEnt.executeSorting(unsortedAry);
    }
}
