package collections_questions;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Map_Q3 {

    public static void main(String[] args) {
        
        Properties stateCapital = new Properties();

        
        stateCapital.setProperty("Andhra Pradesh", "Amaravati");
        stateCapital.setProperty("Karnataka", "Bengaluru");
        stateCapital.setProperty("Maharashtra", "Mumbai");
        stateCapital.setProperty("Tamil Nadu", "Chennai");
        stateCapital.setProperty("West Bengal", "Kolkata");

        
        Set<Map.Entry<Object, Object>> entrySet = stateCapital.entrySet();
        Iterator<Map.Entry<Object, Object>> it = entrySet.iterator();

        System.out.println("List of Indian States and their Capitals:");
        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
