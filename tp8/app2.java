import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        String premierMot = ch.split(" ")[0];
        System.out.println("Le premier mot est : " + premierMot);

        scanner.close();
    }
}