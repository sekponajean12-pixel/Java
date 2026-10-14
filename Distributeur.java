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
        stock += REAPROVISIONNEMENT;
        int stockApresReaprovisionnement = stock;


        //Saisies utilisateur
        System.out.print("Nom du client : ");
        nomClient = Clavier.nextLine();
        System.out.print("Combien de boisson voulez vous ? : ");
        quantite = Clavier.nextInt();
        System.out.print("Montant payé : ");
        montantPaye = Clavier.nextDouble();
        Clavier.nextLine(); //Vider le buffer

        //verification

        if (quantite <= 0) {
            System.out.println("Attention : la quantité doit être positive.");
            Clavier.close();
            return;
        }
        if (quantite > stock) {
            System.out.println("Attention : stock insuffisant (il reste " + stock + " boissons).");
            Clavier.close();
            return;
    }
        
    //Calculs
        double montantATotal = quantite * PRIX_BOISSON;
        monnaie = montantPaye - montantATotal;
        monnaie = Math.round(monnaie * 100.0) / 100.0; //Arrondi à 2 décimales
        

        //Affichage
        System.out.println("Nom du client : " + nomClient);
        System.out.println("Quantité achetée : " + quantite);
        System.out.println("Montant payé : " + montantPaye);
        System.out.println("Montant total : " + montantATotal);
        System.out.println("Monnaie à rendre : " + monnaie);
        System.out.println("Stock restant : " + stock);

        Clavier.close();
}
}