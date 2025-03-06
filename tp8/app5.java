import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ch.length(); i++) {
            result.append(ch.charAt(i));
            if (i != ch.length() - 1) {
                result.append('*');
            }
        }

        System.out.println("Résultat : " + result.toString());

        scanner.close();
    }
}