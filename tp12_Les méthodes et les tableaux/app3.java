import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        int n = LectureN();
        int[] T = new int[n];
        RemplirTab(T);
        
        int[] T_pair = CréerTpair(T);
        int[] T_impair = CréerTimpair(T);
        
        System.out.println("Tableau des pairs:");
        AfficheTab(T_pair);
        System.out.println("Tableau des impairs:");
        AfficheTab(T_impair);
    }
    
    public static int LectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez la taille du tableau (n > 0): ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static void RemplirTab(int[] T) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remplissage du tableau (entiers positifs):");
        for (int i = 0; i < T.length; i++) {
            do {
                System.out.print("Element " + (i+1) + ": ");
                T[i] = scanner.nextInt();
            } while (T[i] < 0);
        }
    }
    
    public static int[] CréerTpair(int[] T) {
        int count = 0;
        for (int num : T) {
            if (num % 2 == 0) count++;
        }
        
        int[] T_pair = new int[count];
        int index = 0;
        for (int num : T) {
            if (num % 2 == 0) {
                T_pair[index++] = num;
            }
        }
        return T_pair;
    }
    
    public static int[] CréerTimpair(int[] T) {
        int count = 0;
        for (int num : T) {
            if (num % 2 != 0) count++;
        }
        
        int[] T_impair = new int[count];
        int index = 0;
        for (int num : T) {
            if (num % 2 != 0) {
                T_impair[index++] = num;
            }
        }
        return T_impair;
    }
    
    public static void AfficheTab(int[] T) {
        for (int value : T) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}