public class Variables {
    public static void main(String[] args){
        int a = 3, b = 4;
        int c = a;
        a = b;
        b = c;
        System.out.println("La valeur de  a est : " + a + " et la valeur de b est : " + b);
    }
}
