package collections_questions;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Set_Q3 {

    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Cherry");
        treeSet.add("Orange");

       
        List<String> list = new ArrayList<>(treeSet);
        Collections.reverse(list);
        System.out.println("Reversed elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("\nTreeSet elements using Iterator:");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

      
        String searchItem = "Mango";
        if (treeSet.contains(searchItem)) {
            System.out.println("\n'" + searchItem + "' exists in the TreeSet.");
        } else {
            System.out.println("\n'" + searchItem + "' does NOT exist in the TreeSet.");
        }
    }
}
