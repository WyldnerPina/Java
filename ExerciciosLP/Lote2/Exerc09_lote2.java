
import javax.swing.JOptionPane;


public class Exerc09_lote2 {
    public static void main (String[] args){

        int n[][] = new int[4][4];
        int rotacao = 0, estatico = 1;

        for(int L=0; L<4; L++){            
            for(int C=0; C<4; C++){ 
               rotacao++;
                if((rotacao == 1)||(rotacao == 6)||(rotacao == 11)||(rotacao == 16)){
                        n[L][C] = estatico;
                        estatico = estatico * 4;
                }
                else{
                    n[L][C] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor ")); 
                }
            }        
        }        

        for(int L=0; L<4; L++){            
            for(int C=0; C<4; C++){            
                System.out.print(n[L][C] + " "); 
            }
            System.out.println();
        }
    }    
}