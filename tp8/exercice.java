import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un verbe du premier groupe (terminé par 'er') : ");
        String verbe = scanner.nextLine().trim().toLowerCase();
        if (!verbe.endsWith("er") || verbe.equals("aller")) {
            System.out.println("Ce n'est pas un verbe régulier du premier groupe.");
        } else {
            String radical = verbe.substring(0, verbe.length() - 2);
            String radicalNous = radical;
            String radicalVous = radical;
            String radicalIls = radical;
            if (verbe.equals("commencer")) {
                radicalNous = "commenç";
                radicalVous = "commenç"; 
                radicalIls = "commenç";   
            }
            System.out.println("Conjugaison au présent de l'indicatif :");
            System.out.println("Je " + radical + "e");
            System.out.println("Tu " + radical + "es");
            System.out.println("Il/Elle " + radical + "e");
            System.out.println("Nous " + radicalNous + "ons");
            System.out.println("Vous " + radicalVous + "ez");
            System.out.println("Ils/Elles " + radicalIls + "ent");
        }
        
        scanner.close();
    }
}