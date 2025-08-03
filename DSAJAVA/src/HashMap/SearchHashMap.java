package HashMap;
import java.util.HashMap;

public class SearchHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));
        System.out.println("Value for key 3: " + map.get(3));
    }
}