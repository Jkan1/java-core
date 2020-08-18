
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
        aList.add(3, 8);
        aList.set(3, aList.get(3) / 2);
        aList.remove(3);        
//        aList.remove(new Integer(4));

        System.out.println(aList);

        for (int item : aList) {
            System.out.print(item + " ");
        }

    }
}
