package templatePattern.duck;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuckTestClient {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dew", 2),
                new Duck("Lee", 7),
                new Duck("Kim", 2),
                new Duck("Park", 10),
                new Duck("Choi", 2)
        };
        System.out.println("정렬 전");
        display(ducks);
        Arrays.sort(ducks);

        System.out.println("정렬 후");
        display(ducks);


    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
