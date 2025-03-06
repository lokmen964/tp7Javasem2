import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine();

        if (chaine != null && !chaine.isEmpty()) {

            System.out.print("Un caractère sur deux : ");
            for (int i = 0; i < chaine.length(); i += 2) {
                System.out.print(chaine.charAt(i));
            }
            System.out.println(); 

            char premierCaractere = chaine.charAt(0);
            char dernierCaractere = chaine.charAt(chaine.length() - 1);
            System.out.println("Premier caractère : " + premierCaractere);
            System.out.println("Dernier caractère : " + dernierCaractere);
        } else {
            System.out.println("La chaîne est vide. Veuillez saisir une chaîne valide.");
        }

        scanner.close();
    }
}