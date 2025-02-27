

public class app1 {
        

    public app1() {
    }
    
   
    public static void main(String[] args) {
    	int[][] M= new int [50][50];
        int nl,nc,i,j,x;
        do{
        	System.out.println("donner le nombre des lignes");
        	nl=Clavier.lireInt();
        	System.out.println("donner le nombre des colones");
        	nc=Clavier.lireInt();
        }while(nl>50 || nc>50);
         for(i=0;i<nc;i++){
        	for(j=0;j<nl;j++){
        		
        		do{
        			System.out.println("M["+i+"]["+j+"]=");
        		M[i][j]=Clavier.lireInt();
        		
        		}while(M[i][j]%2!=0);
        			
        	}
        	}
        
        i=0;
        j=0;
        System.out.println("donner le nombre a chercher:");
        	x=Clavier.lireInt();
        while(M[i][j]!=x && (i!=nc || j!=nl)){
        	if(i==nc){
        		i=0;
        		j++;
        	}	
        	else{
        		i++;
        	}
        }
        System.out.println("la psition de x est :m["+i+"]["+j+"]");
      
       
        
    }
  }

