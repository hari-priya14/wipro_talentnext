package oops_questions;
import java.util.*;
class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
 class EmployeeDetails {
    String name;

    EmployeeDetails(String name) {
        this.name = name;
    }
}

public class Question11 {
    public static void main(String[] args) {
      
        EmployeeDetails emp = new EmployeeDetails("John");

        
        EmployeeDetails result = Optional.ofNullable(emp)
        		                  .orElseThrow(() -> new InvalidEmployeeException("Employee object is null"));

        System.out.println("Employee Name: " + result.name);
    }
}