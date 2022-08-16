
package exerc11;


public class Exerc11 {

   
    public static void main(String[] args) {
        int m [][] = new int [8][8];
        int x, y, z;
        
         for(z=1; z<=4; z++){
            for(x=(z-1); x<=(8-z); x++){
                    for(y=(z-1); y<=(8-z); y++){
                           m[x][y]=z;
                    }
            }
        }
         
        for(int L=0; L<8; L++){            
            for(int C=0; C<8; C++){
                System.out.print(m[L][C]);        
            }
            System.out.println();
        }
    }
}
    
