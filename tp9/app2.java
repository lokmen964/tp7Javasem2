import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères (max 30 caractères) : ");
        String ch = scanner.nextLine();

        if (ch.length() > 30) {
            System.out.println("Erreur : La longueur dépasse la limite.");
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < ch.length(); i++) {
                char c = ch.charAt(i);
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) (base + (c - base + 3) % 26);
                }
                result.append(c);
            }
            System.out.println("Résultat : " + result.toString());
        }

        scanner.close();
    }
}