package HashMap;

import java.util.*;

public class HashMapToTreeMapSortedByValue {
    public static void main(String[] args) {
        // Unsorted HashMap with unordered key-value pairs
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(5, "Banana");
        unsortedMap.put(1, "Apple");
        unsortedMap.put(3, "Date");
        unsortedMap.put(4, "Cherry");
        unsortedMap.put(2, "Elderberry");

        System.out.println("Unsorted HashMap: " + unsortedMap);

        // TreeMap to store keys sorted
        TreeMap<Integer, String> treeMap = new TreeMap<>(unsortedMap);
        System.out.println("TreeMap (sorted by keys): " + treeMap);

        // Sort entries by value
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(treeMap.entrySet());

        entries.sort(Map.Entry.comparingByValue());

        System.out.println("Entries sorted by value:");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}