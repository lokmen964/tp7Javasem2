import java.util.Scanner;

public class app2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nl, nc;

        do {
            System.out.print("Entrez le nombre de lignes (1-29) : ");
            nl = scanner.nextInt();
        } while (nl <= 0 || nl >= 30);

        do {
            System.out.print("Entrez le nombre de colonnes (1-29) : ");
            nc = scanner.nextInt();
        } while (nc <= 0 || nc >= 30);

        int[][] m = new int[nl][nc];

        System.out.println("Remplissez la matrice avec des nombres strictement positifs :");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                int valeur;
                do {
                    System.out.print("Entrez un nombre strictement positif pour la case [" + i + "][" + j + "] : ");
                    valeur = scanner.nextInt();
                } while (valeur <= 0); 
                m[i][j] = valeur;
            }
        }

        int somme = 0;
        long produit = 1;
        int total = nl * nc;

        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                somme += m[i][j];
                produit *= m[i][j];
            }
        }

        double moyenne = (double) somme / total;

        System.out.println("La somme des éléments du tableau est : " + somme);
        System.out.println("Le produit des éléments du tableau est : " + produit);
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);

        scanner.close();
    }
}