import java.util.Scanner;
public class BulletinDeNote {
    public static void main(String[] args) {
          //Constantes & variables
        Scanner clavier = new Scanner(System.in);
        final int NB_MATIERES = 4;
        final double SEUIL_ADMISSION = 10.0;
        final double NOTE_MAX = 20.0;

        String nom = "";
        String classe = "";
        double note = 0.0;
        double somme = 0.0;
        double moyenne = 0.0;
        int nbEchouees = 0;
        int nbValidees = 0;

        //Saisies utilisateur
        System.out.print("Entrez le nom de l'élève : ");
        nom = clavier.nextLine();

        System.out.print("Entrez la classe de l'élève : ");
        classe = clavier.nextLine();
        for (int i = 1; i <= NB_MATIERES; i++) {
            System.out.print("Entrez la note de la matière " + i + " : ");
            note = clavier.nextDouble();
            if (note < 0 || note > NOTE_MAX) {
                System.out.println("Note invalide (" + note + ") : Comptée comme 0 pour cette matière");
                note = 0;
            }
            somme += note;
            if (note >= 10) {
                nbValidees++;
            } else {
                nbEchouees--;
            }
            clavier.nextLine(); 
        }

        // Calculs
        String garde = "";
        String mention = "";
        moyenne = somme / NB_MATIERES;
        moyenne = Math.round(moyenne * 100.0) / 100.0; // Arrondi à 2 décimales
        int nbEchoueesAbs = Math.abs(nbEchouees); // Convertir en valeur absolue

        if (moyenne >= 16) {
            garde = "A";
            mention = "Excellent";
        } else if (moyenne >= 14) {
            garde = "B";
            mention = "Très bien";
        } else if (moyenne >= 12) {
            garde = "C";
            mention = "Bien";
        } else if (moyenne >= 10) {
            garde = "D";
            mention = "Passable";
        } else if (moyenne >= 8) {
            garde = "E";
            mention = "Insuffisant";
        } else {
            garde = "F";
            mention = "Échec";
        }

        clavier.close();
    }
}