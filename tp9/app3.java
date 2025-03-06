import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères (max 20 caractères) : ");
        String ch = scanner.nextLine();

        if (ch.length() > 20) {
            System.out.println("Erreur : La longueur dépasse la limite.");
        } else {
            StringBuilder result = new StringBuilder();
            boolean capitalizeNext = true;

            for (int i = 0; i < ch.length(); i++) {
                char c = ch.charAt(i);
                if (capitalizeNext && Character.isLetter(c)) {
                    c = Character.toUpperCase(c);
                    capitalizeNext = false;
                } else if (c == ' ') {
                    capitalizeNext = true;
                }
                result.append(c);
            }

            System.out.println("Résultat : " + result.toString());
        }

        scanner.close();
    }
}