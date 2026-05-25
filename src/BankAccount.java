
public class BankAccount {

    // le compte
    protected String account;

    // le solde disponible dans le compte
    protected int balance;

    // pour initialiser le compte et le solde
    public BankAccount(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    // pour retourner le compte
    public String getAccount() {
        return this.account;
    }

    // pour modifier le compte
    public void setAccount(String account) {
        this.account = account;
    }

    // pour retourner le solde du compte
    public int getBalance() {
        return this.balance;
    }

    // pour modifier le solde du compte
    public void setBalance(int balance) {
        this.balance = balance;
    }
}