import java.util.Scanner ;
public class ex1 {
        public static int lecture() {
            Scanner sr=new Scanner(System.in);
        int x;
        do {
            System.out.println("Donner un entier strictement positif :");
            x = sr.nextInt();
        } while (x <= 0);
        return x;
    }
    public static int compter(int x) {
        String ch = String.valueOf(x);
        return ch.length();
    }
    public static void main(String[] args) {
        int entier = lecture();
        int longueur = compter(entier);
        System.out.println("La longueur de "+entier+" est : "+ longueur);
    }

}