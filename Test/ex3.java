import java.util.Scanner;

public class ex3 {

    public static boolean estInf(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }

    public static String groupe(String verbe) {
        if (verbe.endsWith("er") && !verbe.equals("aller")) {
            return "1er groupe";
        } else if (verbe.endsWith("ir")) {
            
            return "2e groupe (à vérifier selon le participe présent)";
        } else {
            return "3e groupe";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verbe;

        do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            verbe = scanner.nextLine();
        } while (!estInf(verbe));

        System.out.println("Le verbe \"" + verbe + "\" appartient au : " + groupe(verbe));
    }
}