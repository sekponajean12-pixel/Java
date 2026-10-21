import java.util.Scanner;
 
public class Calcul {
 
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
 
        System.out.print("Premier nombre entier : ");
        int a = clavier.nextInt();
 
        System.out.print("Deuxième nombre entier : "); 
        int b = clavier.nextInt();
 
        System.out.print("Opération (+, -, *, /) : ");
        String op = clavier.next();
 
        if (op.equals("+")) {
            System.out.println("La somme est : " + Math.addExact(a, b));
        } else if (op.equals("-")) {
            System.out.println("La différence est : " + Math.subtractExact(a, b));
        } else if (op.equals("*")) {
            System.out.println( "Le produit est : " + Math.multiplyExact(a, b));
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Erreur : division par zéro !");
            } else {
                System.out.println( "Le quotient est : " + Math.floorDiv(a, b));
            }
        } else {
            System.out.println("Opération inconnue");
        }
        clavier.close();
    }
}