import java.util.*;
/**
 *
 * @author kan
 */
public class HashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        HashMap<String, Integer> map = new HashMap<>();

        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}