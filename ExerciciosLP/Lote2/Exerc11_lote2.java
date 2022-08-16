// Criar uma matriz [8][8] inteiro e o programa ir√° carregar segundo:

import javax.swing.JOptionPane;

public class Exerc11_lote2 {
     public static void main (String[] args){

        int n[][] = new int[8][8];
        int cont = 1;

        
        long inicio = System.currentTimeMillis(); // PARA MEDIR O TEMPO
        System.out.println("tempo inicial: " + inicio);

        for(int L=0; L<4; L++){
            cont = 1;
            for(int C=0; C<4; C++){
                n[L][C] = n[L][7 - C] = n[7 - L][C] = n[7 - L][7 - C] = cont;               
                if (cont <= L){
                    cont++;
                }
             }
        }

        long fim = System.currentTimeMillis();
        System.out.println("tempo inicial: " + fim);
        System.out.println("tempo de execuÁ„o: " + (inicio - fim));
        
        for(int L=0; L<8; L++){
            for(int C=0; C<8; C++){
                System.out.print(n[L][C] + " ");                
            }            
            System.out.println();
        }
        
    }       
}
