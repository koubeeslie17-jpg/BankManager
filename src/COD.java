
public class COD extends BankAccount {

    // la durée du dépôt en mois
    private int durationMonths;

    // pour initialiser le compte, le solde et la durée
    public COD(String account, int balance, int durationMonths) {

        // pour appeller le constructeur de la classe BankAccount
        super(account, balance);
        this.durationMonths = durationMonths;
    }

    // pour retourner la durée du dépôt
    public int getDurationMonths() {
        return this.durationMonths;
    }

    // pour modifier la durée du dépôt
    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }
}