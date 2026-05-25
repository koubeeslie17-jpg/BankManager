
public class CheckingAccount extends BankAccount {

    // la limite autorisée sur le compte courant
    private int limit;

    // pour initialiser le compte, le solde et la limite
    public CheckingAccount(String account, int balance, int limit) {

        // pour appelle le constructeur de la classe BankAccount
        super(account, balance);
        this.limit = limit;
    }

    // pour retourner la limite du compte
    public int getLimit() {
        return this.limit;
    }

    // pour modifier la limite du compte
    public void setLimit(int limit) {
        this.limit = limit;
    }
}
