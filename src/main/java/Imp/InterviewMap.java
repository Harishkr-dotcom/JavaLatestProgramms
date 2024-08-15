package Imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewMap {
	public static void main(String[] args) {
        // Create and populate the HashMap
        Map<String, Integer> bankBalances = new HashMap<>();
        bankBalances.put("Sam", 2000);
        bankBalances.put("Rajiv", 400);
        bankBalances.put("Yusuf", 560);
        bankBalances.put("Jack", 770);
        
        // Step 2: Convert HashMap to a List of Map.Entry
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(bankBalances.entrySet());

        // Step 3: Sort the List by bank balance using a custom comparator
        entryList.sort(Map.Entry.comparingByValue());

        // Step 4: Print the sorted entries
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ", $" + entry.getValue());
        }

        // Sort the map by values and print the result
        bankBalances.entrySet().stream()
            .sorted(Map.Entry.comparingByValue()) // Sort by bank balance
            .forEach(entry -> System.out.println(entry.getKey() + ", $" + entry.getValue())); // Print each entry
    }

}
