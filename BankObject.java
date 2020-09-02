
/**
 *
 * @author kan
 */
public class BankObject {

    private int accountNo;
    private float balance;

    public BankObject(int acn, float bal) {
        this.accountNo = acn;
        this.balance = bal;
    }

    public int getAccountNumber() {
        return this.accountNo;
    }

    public void setAccountNumber(int acn) {
        this.accountNo = acn;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float bal) {
        this.balance = bal;
    }
}
