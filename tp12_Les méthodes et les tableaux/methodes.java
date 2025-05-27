import java.util.Scanner;

public class methodes {
    public static  lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("entrer un nombre strictement positive ");
            while(!scanner.hasNextInt()){
                System.out.println("errer");
                scanner.next();
            }n=scanner.nextInt();

        }while(n<=0);
    
}
public static int[] RemplirTab( int n) {
    Scanner scanner = new Scanner(System.in);
    int[] T = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Entrez l'élément T[" + i + "] : ");
        T[i] = scanner.nextInt();
    }
    return T;
}






}

