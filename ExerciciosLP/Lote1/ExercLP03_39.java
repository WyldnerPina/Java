// Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
// Casa: 1 2 3 4 ... 64
// Qte: 1 2 4 8 ... N.

import javax.swing.*;

public class ExercLP03_39 {
public static void main (String args [ ]) {
    
   double graos = 1, aux = 1;
      
   for (int i=1; i<64; i++){
        if (i == 1){
            graos = 1;
            System.out.println(graos + " ");
        }
        graos = aux * 2;
        aux = graos;
        System.out.println(graos + " ");                           
    }
 }
}