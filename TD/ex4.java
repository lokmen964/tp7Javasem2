

public class ex4 {
    
    public static class TabInd1{
        public static void main(String[] args) {
            {
                int [][]t=new int[3][];
                for (int i=0;i<3;i++){
                    t[i]=new int [i+1];
                    for (int j=0;j<t[i].length;j++){
                        t[i][j]=i+j;
                    }
                    for (int k=0;k<3;k++){
                        System.out.print("Tableau numéro" + k + "=");
                        for (int j=0;j<t[k].length;j++){
                            System.out.print(t[k][j]+ " ");
                            System.out.println();


                    }
                }
            }
        }
    }
}
}
