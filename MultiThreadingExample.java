
import static java.lang.Thread.currentThread;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kan
 */
public class MultiThreadingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        MyThread thread1 = new MyThread();
        MyRunnable runnableObject = new MyRunnable();
        Thread thread2 = new Thread(runnableObject);
        thread1.start();
        thread2.start();
        System.out.println("Main Thread " + Thread.currentThread().getName() + " id-" + Thread.currentThread().getId());

    }

    private static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Inside Thread " + currentThread().getName() + " id-" + currentThread().getId());
            calculateSum();
        }

        public void calculateSum() {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("CalculateSum Inside Thread " + currentThread().getName() + " id-" + currentThread().getId());
            System.out.println("Sum : " + sum);
        }
    }

    private static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Inside Thread " + Thread.currentThread().getName() + " id-" + Thread.currentThread().getId());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiThreadingExample.class.getName()).log(Level.SEVERE, null, ex);
            }
            calculateProduct();
        }

        public void calculateProduct() {
            int prod = 1;
            for (int i = 2; i <= 10; i++) {
                prod = prod * i;
            }
            System.out.println("CalculateProd Inside Thread " + currentThread().getName() + " id-" + currentThread().getId());
            System.out.println("Product : " + prod);
        }

    }
}
