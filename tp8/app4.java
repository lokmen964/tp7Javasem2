import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        String inverse = new StringBuilder(ch).reverse().toString();
        System.out.println("Chaîne inversée : " + inverse);

        scanner.close();
    }
}