import java.util.Scanner;

public class CaisseBoutique {
    public static void main(String[] args) {

        //Constantes & variables

        final double TAUX_TVA = 0.18;

        String nomArticle = "";
        double prixUnitaire = 0.0;
        int quantite = 0;
        Scanner clavier = new Scanner(System.in);
        String nomClient = "";
        double totalHT = 0.0;
        double montantTVA = 0.0;
        double totalTTC = 0.0;
        double rest = 0.0;

        totalHT = prixUnitaire * (double) quantite;
        montantTVA = totalHT * TAUX_TVA;
        totalTTC = totalHT + montantTVA;

        // Afichage des informations sur l'article

        System.out.print("Nom de l'article : ");
        nomArticle = clavier.nextLine();
        System.out.print("Prix unitaire : ");
        prixUnitaire = clavier.nextDouble();
        System.out.print("Quantité : ");
        quantite = clavier.nextInt();
        clavier.nextLine(); // Consomme le retour à la ligne après la saisie de l'entier
        System.out.print("Nom du client : ");
        nomClient = clavier.nextLine();
    }
}

