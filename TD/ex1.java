public class ex1 {

    // Méthode pour calculer la somme des valeurs d'un tableau de doubles
    public static double somme(double[] tableau) {
        double somme = 0;
        for (double valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }

    // Méthode pour incrémenter toutes les valeurs d'un tableau de doubles
    public static void incre(double[] tableau, double increment) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] += increment;
        }
    }

    // Programme d'essai
    public static void main(String[] args) {
        double[] tableau = {1.5, 2.5, 3.5, 4.5};

        System.out.println("Tableau initial :");
        for (double valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();

        // Calcul de la somme
        double somme = somme(tableau);
        System.out.println("Somme des valeurs : " + somme);

        // Incrémentation des valeurs
        incre(tableau, 1.0);
        System.out.println("Tableau après incrémentation de 1.0 :");
        for (double valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}