// Java program to demonstrate the
// working of a LinkedList
import java.util.*;

public class LinkedListExample {
    public static void main(String args[])
    {
        // Creating an object of the
        // class linked list
        LinkedList<String> object
            = new LinkedList<String>();

        // Adding the elements to the
        // linked list
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("O");
        
        System.out.println(object);

        // Removing elements from the
        // list
        object.remove(2);
        object.removeFirst();

        System.out.println("Linked list after "
                           + "deletion: " + object);
    }
}
