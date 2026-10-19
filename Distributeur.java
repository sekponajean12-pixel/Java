import java.util.Scanner;
public class Distributeur {
    public static void main(String[] args) {

        //Constantes & variables
        final int REAPROVISIONNEMENT = 3;
        final double PRIX_BOISSON = 350.0;
        final int STOCK_INITIAL = 5;
        Scanner Clavier = new Scanner(System.in);
        String nomClient = "";
        int quantite = 0;
        double montantPaye = 0.0;
        double monnaie = 0.0;
        int stock ;
        stock = STOCK_INITIAL;
        stock += 3;
        int stockApresReaprovisionnement = stock;


        //Saisies utilisateur
        System.out.print("Nom du client : ");
        nomClient = Clavier.nextLine();
        System.out.print("Combien de boisson voulez vous ? : ");
        quantite = Clavier.nextInt();
        System.out.print("Montant payé : ");
        montantPaye = Clavier.nextDouble();
        Clavier.nextLine(); //Vider le buffer
        
    //Calculs
        double montantATotal = quantite * PRIX_BOISSON;
        monnaie = montantPaye - montantATotal;
        monnaie = Math.round(monnaie * 100.0) / 100.0; //Arrondi à 2 décimales

     // ===== 5. Décomposition de la monnaie avec % =====
        int reste = (int) monnaie;   // transtypage double -> int
 
        int b10000 = reste / 10000;
        reste = reste % 10000;
 
        int b5000 = reste / 5000;
        reste = reste % 5000;
 
        int b2000 = reste / 2000;
        reste = reste % 2000;
 
        int b1000 = reste / 1000;
        reste = reste % 1000;
 
        int p500 = reste / 500;
        reste = reste % 500;
 
        int p100 = reste / 100;
        reste = reste % 100;
 
        int p25 = reste / 25;
        reste = reste % 25;

        // ===== 6. Affichage des résultats =====

        System.out.println("===== DISTRIBUTEUR AUTOMATIQUE =====");
        System.out.println("Client : " + nomClient);
        System.out.println("Prix unitaire : " + PRIX_BOISSON + " F");
        System.out.println();
        System.out.println("Stock initial : " + STOCK_INITIAL);
        System.out.println("Après réapprovisionnement (+" + REAPROVISIONNEMENT + ") : " + stockApresReaprovisionnement);
        System.out.println("Boissons vendues : " + quantite);
        System.out.println("Stock restant : " + stock);
        System.out.println();
        System.out.println("Total à payer : " + montantATotal + " F");
        System.out.println("Montant payé : " + montantPaye + " F");
        System.out.println("Monnaie à rendre : " + monnaie + " F");
        System.out.println();
        System.out.println("--- Détail du rendu ---");
        System.out.println("Billets de 10000 : " + b10000);
        System.out.println("Billets de 5000  : " + b5000);
        System.out.println("Billets de 2000  : " + b2000);
        System.out.println("Billets de 1000  : " + b1000);
        System.out.println("Pièces  de 500   : " + p500);
        System.out.println("Pièces  de 100   : " + p100);
        System.out.println("Pièces  de 25    : " + p25);
        System.out.println();
        System.out.println("Merci " + nomClient + ", à bientôt !");
        System.out.println("====================================");
        
}
}