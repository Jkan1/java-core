
/**
 *
 * @author kan
 */
import java.util.*;
import java.lang.Thread;
import static java.lang.Thread.currentThread;

public class BankSynchronization {

    public static void main(String args[]) throws InterruptedException {

        BankObject B1 = new BankObject(1, 100);
        BankObject B2 = new BankObject(2, 300);

        TransactionThread T1 = new TransactionThread(B1, true, 200);
        TransactionThread T2 = new TransactionThread(B1, false, 150);
        TransactionThread T3 = new TransactionThread(B1, true, 200);

        TransactionThread T4 = new TransactionThread(B2, false, 200);
        TransactionThread T5 = new TransactionThread(B2, true, 150);
        TransactionThread T6 = new TransactionThread(B2, false, 100);

        T1.start();
        T2.start();
        T3.start();

        T4.start();
        T5.start();
        T6.start();

        T1.join();
        T2.join();
        T3.join();

        T4.join();
        T5.join();
        T6.join();

        System.out.println("Balance B1 : " + B1.getBalance() + " | Balance B2 : " + B2.getBalance());
    }

    private static class TransactionThread extends Thread {

        private BankObject bank;
        private boolean isDeposite;
        private float amount;

        public TransactionThread(BankObject bank, boolean isDeposit, float amount) {
            this.bank = bank;
            this.isDeposite = isDeposit;
            this.amount = amount;
        }

        @Override()
        public void run() {
            try {
                if (this.isDeposite) {
                    deposit();
                } else {
                    withdraw();
                }
            } catch (Exception ex) {
                System.out.println("Exception Occurred " + ex.toString());
            }
        }

        public void deposit() throws InterruptedException {
//            synchronized (BankObject.class) { // To Block All Objects Of Type CLASSNAME
            synchronized (this.bank) {
                System.out.println("Deposit - " + currentThread().getName());
                Thread.sleep(2000);
                float balance = this.bank.getBalance();
                this.bank.setBalance(balance + this.amount);
            }
        }

        public void withdraw() throws InterruptedException {
//            synchronized (BankObject.class) { // To Block All Objects Of Type CLASSNAME
            synchronized (this.bank) {

                System.out.println("Withdraw - " + currentThread().getName());
                Thread.sleep(2000);
                float balance = this.bank.getBalance();
                this.bank.setBalance(balance - this.amount);
            }
        }
    }
}
