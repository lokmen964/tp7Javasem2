import java.util.Scanner;

public class Application1 {

    
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n <= 0) {
            System.out.print("Entrez un entier strictement positif : ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("L'entier doit être strictement positif.");
                }
            } else {
                System.out.println("Ce n'est pas un entier  !");
                sc.next(); 
            }
        }
        return n;
    }
  
   public static int[] lectureX1X2() {
    Scanner sc = new Scanner(System.in);
    int[] valeurs = new int[2];
    System.out.print("Entrez la valeur X1 à remplacer : ");
    valeurs[0] = sc.nextInt();
    System.out.print("Entrez la valeur X2 de remplacement : ");
    valeurs[1] = sc.nextInt();
    return valeurs;
}

    public static void RemplirTab(int[] tab) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.print("T[" + i + "] = ");
            tab[i] = sc.nextInt();
        }
    }

 
    public static void Remplacer(int[] tab, int x1, int x2) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x1) {
                tab[i] = x2;
            }
        }
    }

    public static void AfficheTab(int[] tab) {
        System.out.print("Contenu du tableau : ");
        for (int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = lectureN();
        int[] T = new int[n];
        RemplirTab(T);
    
        int[] valeurs = lectureX1X2();
        int x1 = valeurs[0];
        int x2 = valeurs[1];
    
        Remplacer(T, x1, x2);
        AfficheTab(T);
    }
    
}