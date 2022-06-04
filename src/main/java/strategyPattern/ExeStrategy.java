package strategyPattern;

import strategyPattern.character.Character;
import strategyPattern.character.King;
import strategyPattern.sorting.BubbleSorting;
import strategyPattern.sorting.SelectionSorting;
import strategyPattern.sorting.Sorting;
import strategyPattern.weapon.KnifeBehavior;
import strategyPattern.weapon.WeaponBehavior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExeStrategy {
    public static void main(String[] args) throws IOException {

        /*Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int[] unsortedAry = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};

        Sorting sorting = Cilent.selectSorting(str);

        sorting.executeSorting(unsortedAry);

    }
}
