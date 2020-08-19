
import java.util.*;

/**
 *
 * @author kan
 */
public class LinkedHashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String a[]) {
        LinkedHashMap<String, String> lhm
                = new LinkedHashMap<String, String>();
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "quiz.geeksforgeeks.org");

        // It prints the elements in same order  
        // as they were inserted     
        System.out.println(lhm);

        System.out.println();

        System.out.println("Value of 'one': " + lhm.get("one"));

        System.out.println("Size : " + lhm.size());

        System.out.println("isEmpty : " + lhm.isEmpty());

        System.out.println("Contains key 'two' : " + lhm.containsKey("two"));

        System.out.println("Contains value 'practice.geeksforgeeks.org' : " + lhm.containsValue("practice.geeksforgeeks.org"));

        System.out.println("delete 'one': " + lhm.remove("one"));

        System.out.println();

        for (Map.Entry mapElement : lhm.entrySet()) {
            String key = (String) mapElement.getKey();

            // Finding the value
            String value = (String) mapElement.getValue();

            System.out.println(key + " : " + value);
        }

    }
}
