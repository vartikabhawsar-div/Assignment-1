import java.util.*;

public class SortHashMapByKeys {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(4, "Grapes");
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

     
        System.out.println("Sorted HashMap by keys:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
