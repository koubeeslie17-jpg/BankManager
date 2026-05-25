
public class Main {

    public static void main(String[] args) {

        // pour créer les comptes et les différentes valeurs
        CheckingAccount checking = new CheckingAccount("ESLIE KOUBE", 3000000, 150000);
        SavingsAccount savings = new SavingsAccount("ESLIE KOUBE", 12000000, 3);
        COD cod = new COD("ESLIE KOUBE", 2500000, 6);

        // pour afficher le compte courant
        System.out.println("COMPTE COURANT");
        System.out.println("Le compte : " + checking.getAccount());
        System.out.println("Le solde est : " + checking.getBalance() + " FCFA");
        System.out.println();

        // pour afficher le compte épargne
        System.out.println("COMPTE ÉPARGNE ");
        System.out.println("Le compte : " + savings.getAccount());
        System.out.println("Le solde est : " + savings.getBalance() + " FCFA");
        System.out.println();

        // pour afficher le certificat de dépôt
        System.out.println("CERTIFICAT DE DÉPÔT");
        System.out.println("Le compte : " + cod.getAccount());
        System.out.println("Le solde est : " + cod.getBalance() + " FCFA");
    }
}