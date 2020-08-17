
import java.util.*;

/**
 *
 * @author kan
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int n = 5;

        ArrayList<Integer> aList = new ArrayList<Integer>(n);

        for (int i = 1; i <= n; i++) {
            aList.add(i);
        }

        System.out.println(aList);
        aList.remove(3);
        System.out.println(aList);

        for (int item : aList) {
            System.out.print(item + " ");
        }

    }
}
