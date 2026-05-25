public class SavingsAccount extends BankAccount {

    // le taux d'intérêt du compte épargne
    private int interestPercent;

    // pour initialiser le compte, le solde et le taux d'intérêt
    public SavingsAccount(String account, int balance, int interestPercent) {

        // pour appeller le constructeur de la classe BankAccount
        super(account, balance);
        this.interestPercent = interestPercent;
    }

    // pour retourner le taux d'intérêt
    public int getInterestPercent() {
        return this.interestPercent;
    }

    // pour modifier le taux d'intérêt
    public void setInterestPercent(int interestPercent) {
        this.interestPercent = interestPercent;
    }
}