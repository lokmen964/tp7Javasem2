import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Donner la taille du tableau: ");
        int n = scanner.nextInt();
        int[] t = new int[n];
        
        remplir(t, scanner);
        System.out.print("Tableau initial: ");
        affich(t);
        
        tri(t);
        System.out.println("\nTableau trié:");
        affich(t);
        
        scanner.close();
    }

    static void remplir(int[] t, Scanner scanner) {
        System.out.println("Donnez " + t.length + " entiers:");
        for (int i = 0; i < t.length; i++) {
            t[i] = scanner.nextInt();
        }
    }

    static void tri(int[] t) {
        int aux;
        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] > t[j]) {
                    aux = t[i];
                    t[i] = t[j];
                    t[j] = aux;
                }
            }
        }
    }

    static void affich(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }
}