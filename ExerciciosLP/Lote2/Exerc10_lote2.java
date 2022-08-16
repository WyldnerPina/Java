
import javax.swing.JOptionPane;


public class Exerc10_lote2 {
    public static void main (String[] args){

        double n[][] = new double[8][8];      

        for(int L=0; L<8; L++){
            for(int C=0; C<8; C++){
                if(C == 0){
                    if(L == 0){
                        n[L][C] = 1;
                    }
                    else{
                        n[L][C] = n[L - 1][C + 7] * 2;
                    }         
                }
                else{
                    n[L][C] = n[L][C - 1] * 2;
                }
            }            
        }


        for(int L=0; L<8; L++){
            for(int C=0; C<8; C++){
                System.out.println(n[L][C] + " ");
            }
        }
    }    
}