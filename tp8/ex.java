import java.util.Scanner;

public class exercice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir un texte : ");
        String texte = scanner.nextLine();

        System.out.print("Donner mot1 : ");
        String mot1 = scanner.nextLine();

        System.out.print("Donner mot2 : ");
        String mot2 = scanner.nextLine();

        int index = texte.indexOf(mot1);
        if (index == -1) {
            System.out.println(mot1 + " n'existe pas dans le texte.");
        } else {
            while (index != -1) {
                texte = texte.substring(0, index) + mot2 + texte.substring(index + mot1.length());
                index = texte.indexOf(mot1, index + mot2.length());
            }
            System.out.println("Le nouveau texte est : " + texte);
        }

        scanner.close();
    }
}