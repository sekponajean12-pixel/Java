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
        double reste = 0.0;

        // Demende à l'utilisateur

        System.out.print("Nom de l'article : ");
        nomArticle = clavier.nextLine();
        System.out.print("Prix unitaire : ");
        prixUnitaire = clavier.nextDouble();
        System.out.print("Quantité : ");
        quantite = clavier.nextInt();
        clavier.nextLine(); // Consomme le retour à la ligne après la saisie de l'entier
        System.out.print("Nom du client : ");
        nomClient = clavier.nextLine();

        //Calculs

        totalHT = prixUnitaire * quantite;
        montantTVA = totalHT * TAUX_TVA;
        totalTTC = totalHT + montantTVA;
        reste = totalTTC % 5000;

        System.out.println("\n===== TICKET DE CAISSE=====");
        System.out.println("Client : " + nomClient);
        System.out.println("Article : " + nomArticle + " - " + quantite + " x " + prixUnitaire + " F");
        System.out.println("Total HT: " + totalHT + " F");
        System.out.println("TVA (18%): " + montantTVA + " F");
        System.out.println("Total TTC: " + totalTTC + " F (en entier: " + (int) totalTTC + " F)");
        System.out.println("Prix unitaire arrondi: " + (int) (prixUnitaire + 0.5) + " F");
        System.out.println("Reste modulo 5000: " + reste + " F");
    }
}

