
import java.util.*;

/**
 *
 * @author kan
 */
public class HashSetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating and initializing an array (of non 
        // primitive type)
        Integer arr[] = {5, 6, 7, 8, 1, 2, 3, 4, 3};

        // Set demonstration using Collections.addAll
        Set<Integer> set = Collections.<Integer>emptySet();
        
        Collections.addAll(set = new HashSet<Integer>(Arrays.asList(arr)));

        // initializing set using Collections.unmodifiable set
        Set<Integer> set2 = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(arr)));

        // Duplicate elements are not printed in a set.
        System.out.println(set + " " + set2);
    }
}
