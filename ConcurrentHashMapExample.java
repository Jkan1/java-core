
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author kan
 */
public class ConcurrentHashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(100, "A");
        m.put(101, "B");
        m.put(102, "C");

        // Here we cant add Hello because 101 key
        // is already present in ConcurrentHashMap object
        m.putIfAbsent(101, "Hello");

        // We can remove entry because 101 key
        // is associated with For value
        m.remove(101, "S");

        // Now we can add Hello
        m.putIfAbsent(101, "X");

        // We cant replace Hello with For
        m.replace(101, "X", "For");
        System.out.println(m);
    }
}
