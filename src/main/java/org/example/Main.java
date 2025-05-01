package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> mixedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evensFromMixed = EvenNumberFilter.filterEvenNumbers(mixedList);
        System.out.println("Original List: " + mixedList);
        System.out.println("Even Numbers List: " + evensFromMixed);
        System.out.println();


        List<Integer> emptyList = Collections.emptyList();
        List<Integer> evensFromEmpty = EvenNumberFilter.filterEvenNumbers(emptyList);
        System.out.println("Original List: " + emptyList);
        System.out.println("Even Numbers List: " + evensFromEmpty);
        System.out.println();

        List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> evensFromOdd = EvenNumberFilter.filterEvenNumbers(oddList);
        System.out.println("Original List: " + oddList);
        System.out.println("Even Numbers List: " + evensFromOdd);
    }
}
