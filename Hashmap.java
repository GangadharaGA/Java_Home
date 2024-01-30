import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        Map<Integer, String> hashMap = new HashMap<>();

        // Add some key-value pairs to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Using a for-each loop to traverse the HashMap

        for(int i=0;i<hashMap.size();i++)
        {
            System.out.println("Value of key"+i+" "+hashMap.get(i));
        }
        // System.out.println("Value of key: "+hashMap.getKey());
        // System.out.println("Value of key: "+hashMap.get(2));
        // for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
        //     Integer key = entry.getKey();
        //     String value = entry.getValue();
        //     System.out.println("Key: " + key + ", Value: " + value);
        // }
    }
}





// public class Hashmap {
    
// }
