import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nl, nc;
        
        
        do {
            System.out.print("Entrez le nombre de lignes (1-49) : ");
            nl = scanner.nextInt();
        } while (nl <= 0 || nl >= 50);
        
       
        do {
            System.out.print("Entrez le nombre de colonnes (1-49) : ");
            nc = scanner.nextInt();
        } while (nc <= 0 || nc >= 50);
        
        int[][] m = new int[nl][nc];
        
        
        System.out.println("Remplissez la matrice avec des nombres pairs :");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                int valeur;
                do {
                    System.out.print("Entrez un nombre pair pour la case [" + i + "][" + j + "] : ");
                    valeur = scanner.nextInt();
                } while (valeur % 2 != 0);
                m[i][j] = valeur;
            }
        }
        
        
        int x;
        do {
            System.out.print("Entrez un nombre pair à rechercher : ");
            x = scanner.nextInt();
        } while (x % 2 != 0);
        
       
        boolean trouve = false;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                if (m[i][j] == x) {
                    System.out.println("Le nombre " + x + " se trouve à la position [" + i + "][" + j + "].");
                    trouve = true;
                }
            }
        }
        
        if (!trouve) {
            System.out.println("Le nombre " + x + " n'existe pas dans la matrice.");
        }
        
        scanner.close();
    }
}