// Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor

import javax.swing.*;

public class ExercLP02_26 {
public static void main (String args [ ]) {
    
    int x, y;
    
    x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
    y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
   
// não foi levado em consideração valores iguais ou nulos
   if (x > y)
      {         
                  if (x % y == 0)
                  {         
                        JOptionPane.showMessageDialog(null,"O número maior é múltiplo do menor");
                  }
                  else
                  {
                        JOptionPane.showMessageDialog(null,"O número maior não é múltiplo do menor");
                  }
      }
   else
      {
                    if (y % x == 0)
                  {         
                        JOptionPane.showMessageDialog(null,"O número maior é múltiplo do menor");
                  }
                  else
                  {
                        JOptionPane.showMessageDialog(null,"O número maior não é múltiplo do menor");
                  }
      }
 } 
} 


