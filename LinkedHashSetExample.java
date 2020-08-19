
import java.util.*;

/**
 *
 * @author kan
 */
public class LinkedHashSetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedHashSet<String> linkedset
                = new LinkedHashSet<String>();

        // Adding element to LinkedHashSet  
        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");

        // This will not add new element as A already exists 
        linkedset.add("A");
        linkedset.add("E");

        System.out.println("Size : " + linkedset.size());
        System.out.println("Original : " + linkedset);
        System.out.println("Removing D : " + linkedset.remove("D"));
        System.out.println("Trying to Remove Z : " + linkedset.remove("Z"));
        System.out.println("A is present : " + linkedset.contains("A"));
        System.out.println("Updated : " + linkedset);
    }
}
