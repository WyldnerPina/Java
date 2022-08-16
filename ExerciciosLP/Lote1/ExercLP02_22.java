// Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

import javax.swing.*;

public class ExercLP02_22 {
public static void main (String args [ ]) {
    
    int x, y, result;
    
    x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
    y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

   // não foi tratado a igualdade. partiu-se do princípio q nunca será digitado números iguais
   if (x > y)
      {         
        JOptionPane.showMessageDialog(null, y + ", " + x);
      }
   else
      { 
        JOptionPane.showMessageDialog(null, x + ", " + y);
      }
 } 
} 


