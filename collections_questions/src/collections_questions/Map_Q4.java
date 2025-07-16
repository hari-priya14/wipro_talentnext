package collections_questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Q4 {

    public static void main(String[] args) {
        
        HashMap<String, Integer> contactList = new HashMap<>();

        contactList.put("Hari", 987654321);
        contactList.put("Priya", 876543210);
        contactList.put("sravani", 765432109);
        contactList.put("Seeta", 987123456);

        String nameToSearch = "Priya";
        if (contactList.containsKey(nameToSearch)) {
            System.out.println("Contact exists with name: " + nameToSearch);
        } else {
            System.out.println("No contact found with name: " + nameToSearch);
        }

      
        int numberToSearch = 987654321;
        if (contactList.containsValue(numberToSearch)) {
            System.out.println("Phone number exists: " + numberToSearch);
        } else {
            System.out.println("Phone number not found: " + numberToSearch);
        }

      
        System.out.println("\nAll contacts:");
        Set<Map.Entry<String, Integer>> entries = contactList.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
