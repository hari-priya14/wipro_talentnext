package collections_questions;

import java.util.*;
import java.util.function.Consumer;

public class Functional_Q2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Consumer<Integer> checkEvenOdd = num -> {
            if (num % 2 == 0)
                System.out.println(num + " even");
            else
                System.out.println(num + " odd");
        };

        numbers.forEach(checkEvenOdd);
    }
}
