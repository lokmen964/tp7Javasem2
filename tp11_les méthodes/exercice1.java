import java.util.Scanner;

public class exercice1 {
    private static final Scanner scanner = new Scanner(System.in); 
    public static int lectureN() {
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt()) { 
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }
    public static boolean estPair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nombres = new int[10]; 

        System.out.println("Veuillez entrer 10 entiers strictement positifs :");
        for (int i = 0; i < 10; i++) {
            nombres[i] = lectureN();
        }

        System.out.println("Les nombres pairs sont : ");
        for (int i = 0; i < 10; i++) {
            if (estPair(nombres[i])) {
                System.out.print(nombres[i] + " ");
            }
        }
        scanner.close();
    }
}