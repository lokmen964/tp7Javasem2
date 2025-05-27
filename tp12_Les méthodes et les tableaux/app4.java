public import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dimensions de la matrice:");
        int n1 = lectureN();
        int n2 = lectureN();
        
        double[][] M = new double[n1][n2];
        RemplirTab(M);
        
        System.out.println("Sommes des lignes:");
        for (int i = 0; i < n1; i++) {
            double somme = CalculSomme(M, n2, i);
            System.out.println("Ligne " + (i+1) + ": " + somme);
        }
    }
    
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez une dimension (n > 0): ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static void RemplirTab(double[][] M) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remplissage de la matrice:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Element [" + (i+1) + "][" + (j+1) + "]: ");
                M[i][j] = scanner.nextDouble();
            }
        }
    }
    
    public static double CalculSomme(double[][] M, int n2, int i) {
        double somme = 0;
        for (int j = 0; j < n2; j++) {
            somme += M[i][j];
        }
        return somme;
    }
}
    

