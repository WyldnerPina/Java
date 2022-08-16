// Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

import javax.swing.*;

public class ExercLP02_24 {
public static void main (String args [ ]) {
    
    int x;
    
    x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
      
   if ((x % 2 == 0) && (x % 3 == 0))
      {         
        JOptionPane.showMessageDialog(null,"O númeor é divisível por 2 e 3");
      }
   else
      { 
        JOptionPane.showMessageDialog(null,"O númeor não é divisível por 2 e 3");
      }
 } 
} 


