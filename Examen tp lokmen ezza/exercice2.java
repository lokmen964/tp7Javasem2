import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        String[][] tab = {
            {"nom", "Catégorie", "DFP", "DLC", "Voie", "Prix"},
            {"Amoxicillin", "Antibiotique", "13-04-2023", "14-03-2026", "Orale", "34.600"},
            {"Corticoides", "Antiflammatoire", "24-08-2024", "25-06-2028", "Orale", "10.225"},
            {"Fluconazole", "Antifongique", "15-03-2023", "15-02-2025", "Orale", "22.765"},
            {"Ceftriaxone","Antibiotique","01-01-2025","01-10-2028","Injectable","106.800"},
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("entrer catégorie de la médicaments");
         System.out.print("Entrez la première lettre de la ville de destination : ");
        char catégorie = sc.next().charAt(0);
        for (String[]: tab) {
            if (charAt(0) == catégorie ) {
                afficher(catégorie);
            }
        }
        
    }
}