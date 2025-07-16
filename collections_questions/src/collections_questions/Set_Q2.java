package collections_questions;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Q2 {

    public static void main(String[] args) {
        
        HashSet<String> employeeNames = new HashSet<>();

      
        employeeNames.add("Hari");
        employeeNames.add("Priya");
        employeeNames.add("Harini");
        employeeNames.add("Harsha");
        employeeNames.add("Kalpana");

        
        System.out.println("Employee Names (using Iterator):");
        Iterator<String> it = employeeNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
