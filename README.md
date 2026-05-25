Description du Projet
Ce projet consiste en la conception d'une application Java de gestion bancaire
L'objectif est d'afficher les informations des différents comptes bancaires d'une personne

Architecture du Code
Le projet est structuré autour de 5 classes principales :
- BankAccount (Classe Mère) : Contient les attributs de base communs à tous les comptes
- CheckingAccount (Classe Fille) : Spécifie un compte courant en ajoutant l'attribut `limit`
- SavingsAccount (Classe Fille) : Spécifie un compte d'épargne en intégrant un attribut de taux d'intérêt `interestPercent`
- COD (Classe Fille) : Spécifie un certificat de dépôt (compte bloqué) avec un attribut pour la durée `durationMonths`
- Main : Point d'entrée de l'application qui montre les trois comptes de la personne en affichant son nom et son solde

 Instructions d'Exécution
- téléchargez ce dépôt GitHub
- Ouvrez le projet dans IntelliJ IDE
- Lancez la classe `Main.java` pour exécuter le programme et voir l'affichage des comptes

