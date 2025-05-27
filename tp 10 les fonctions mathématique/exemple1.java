import java.util.Scanner ;
public class exemple1 {
    static double[] valeur = {-5.7, -5.5, -5.2, -5.0, -5.2, -5.5, -5.7};

    public static void main(String[] args) {
        for (int i = 0; i < valeur.length; i++) {
            System.out.println("rint(" + valeur[i] + ")=" + Math.rint(valeur[i]));
        }
    }
}