import java.util.Arrays;

public class ex2 {
    
    class Vecteur {
        private final double[] composantes;

        public double[] getComposantes() {
            return composantes;
        }

        // Constructeur
        public Vecteur(double... composantes) {
            this.composantes = composantes;
        }

        // Produit scalaire
        public double produitScalaire(Vecteur autre) {
            if (this.composantes.length != autre.composantes.length) {
                return 0;
            }
            double resultat = 0;
            for (int i = 0; i < this.composantes.length; i++) {
                resultat += this.composantes[i] * autre.composantes[i];
            }
            return resultat;
        }

        // Addition de vecteurs
        public Vecteur addition(Vecteur autre) {
            if (this.composantes.length != autre.composantes.length) {
                return null;
            }

            double[] somme = new double[this.composantes.length];
            for (int i = 0; i < this.composantes.length; i++) {
                somme[i] = this.composantes[i] + autre.composantes[i];
            }
            return new Vecteur(somme);
        }

        // Affichage
        public void afficher() {
            System.out.println(Arrays.toString(this.composantes));
        }
    }
}