import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères (max 50 caractères) : ");
        String ch = scanner.nextLine();

        System.out.print("Entrez mot1 (max 10 caractères) : ");
        String mot1 = scanner.nextLine();

        System.out.print("Entrez mot2 (max 10 caractères) : ");
        String mot2 = scanner.nextLine();

        if (ch.length() > 50 || mot1.length() > 10 || mot2.length() > 10) {
            System.out.println("Erreur : La longueur dépasse la limite.");
        } else {
            ch = ch.replace(mot1, mot2);
            System.out.println("Résultat : " + ch);
        }

        scanner.close();
    }
}