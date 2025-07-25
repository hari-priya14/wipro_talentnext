package collections_questions;

import java.time.LocalDate;

public class DataTime_Q1 {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();

        if (LocalDate.now().isLeapYear()) {
            System.out.println(currentYear + " is a Leap Year");
        } else {
            System.out.println(currentYear + " is Not a Leap Year");
        }
    }
}
