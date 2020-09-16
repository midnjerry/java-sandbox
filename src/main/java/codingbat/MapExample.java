package codingbat;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Apple counter

        // I want to know if a person has apples or not.

        Map<String, Integer> appleCounter = new HashMap<>();

        appleCounter.put("Aiden", 1);

        System.out.println(appleCounter.get("Aiden"));
        System.out.println(appleCounter.getOrDefault("Jerry", 0));

        appleCounter.put("Aiden", 2);
        System.out.println(appleCounter.get("Aiden"));


        appleCounter.put("Atiyya", 10);
        System.out.println(appleCounter.get("Atiyya"));

        // foreach loop
        System.out.println("ForEach loop");
        for (String key: appleCounter.keySet()){
            System.out.println(key + " has " + appleCounter.get(key) + " apples.");
        }

        System.out.println("Values: " + appleCounter.values());

        String name = "Roger";
        if (appleCounter.containsKey(name)){
            System.out.println("This map contains " + name);
        } else {
            System.out.println("This map does not contain " + name);
        }

            System.out.println(appleCounter.size());





        // How would you track the number of apples each person has.
        // You don't know who the people are before hand.
        // Your size can change.



    }
}
