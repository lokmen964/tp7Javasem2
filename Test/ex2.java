import java.util.Scanner;
public class ex2{
    public static double addition(double a, double b) {
        return a + b;
    }
    public static double soustraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro !");
            return Double.NaN; 
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez une opération : (1 - Addition ) (2 - Soustraction) (3 - Multiplication) (4 - Division)");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();
        System.out.print("Entrez le second nombre : ");
        double num2 = scanner.nextDouble();
        double resultat;

        switch (choix) {
            case 1:
                resultat = addition(num1, num2);
                System.out.println("Résultat : " + resultat);
                break;
            case 2:
                resultat = soustraction(num1, num2);
                System.out.println("Résultat : " + resultat);
                break;
            case 3:
                resultat = multiplication(num1, num2);
                System.out.println("Résultat : " + resultat);
                break;
            case 4:
                resultat = division(num1, num2);
                if (!Double.isNaN(resultat)) {
                    System.out.println("Résultat : " + resultat);
                }
                break;
        }

        scanner.close();
    }
}