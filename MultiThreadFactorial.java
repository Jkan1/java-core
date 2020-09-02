
import java.math.BigInteger;
import java.lang.Thread;
import static java.lang.Thread.currentThread;

/**
 *
 * @author kan
 */
public class MultiThreadFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        int list[] = {15000, 20000, 30000, 102000, 50000, 29000, 60000};

        FactorialNow factThreads[] = new FactorialNow[list.length];

        long start = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
//            System.out.println(calculateFact(list[i]));
            factThreads[i] = new FactorialNow(list[i]);
//            factThreads[i].setDaemon(true);
            factThreads[i].start();
        }

        for (int i = 0; i < factThreads.length; i++) {
            factThreads[i].join();
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(i + 1 + " " + factThreads[i].result);
        }

        System.out.println("Main Thread : " + currentThread().getName() + " id: " + currentThread().getId());

        System.out.println(System.currentTimeMillis() - start + " ms taken");
    }

    public static BigInteger calculateFact(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private static class FactorialNow extends Thread {

        private int num;
        private BigInteger result;

        FactorialNow(int num) {
            this.num = num;
            this.result = BigInteger.ONE;
        }

        @Override()
        public void run() {
            System.out.println(this.num + " : Child Thread : " + currentThread().getName() + " id: " + currentThread().getId());
            for (int i = 2; i <= this.num; i++) {
                this.result = this.result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(this.num + " Completed");
        }
    }
}
