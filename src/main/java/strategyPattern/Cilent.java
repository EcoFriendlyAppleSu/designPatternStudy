package strategyPattern;

import strategyPattern.sorting.BubbleSortingEnt;
import strategyPattern.sorting.SelectionSortingEnt;
import strategyPattern.sorting.SortingEnt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cilent {

    private String cilentInputStr;

    public Cilent() throws IOException {
        cilentInput();
    }

    private void cilentInput() throws IOException {
        System.out.println("사용할 정렬을 입력해 주세요");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        this.cilentInputStr = bufferedReader.readLine();
    }

    public SortingEnt selectSorting() {

        // validation algorithm
        if (this.cilentInputStr.equals("select")) {
            return new SelectionSortingEnt();
        } else if (this.cilentInputStr.equals("bubble")) {
            return new BubbleSortingEnt();
        }
        return null;
    }
}
