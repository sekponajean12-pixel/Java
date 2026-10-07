import java.util.Scanner;

public class Lecture {
public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    int n = 0;
    String str1 = "";
    String str2 = "";
        System.out.println("Entrez un entier : ");
        n = clavier.nextInt();
        clavier.nextLine();

        System.out.println("Entrez du Texte : ");
        str1 = clavier.nextLine();

        System.out.println("Entrez du Texte  : ");
        str2 = clavier.nextLine();

        System.out.println("Vous avez entré: " + n);
        System.out.println("Vous avez entré : " + str1);
        System.out.println("Vous avez entré : " + str2);

    }
}
