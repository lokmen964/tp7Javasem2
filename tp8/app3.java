import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        String inverse = new StringBuilder(ch).reverse().toString();

        if (ch.equalsIgnoreCase(inverse)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }

        scanner.close();
    }
}