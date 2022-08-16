// Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não 
// necessariamente em ordem. Mostre os 4 números em ordem crescente.
import javax.swing.*;

public class ExercLP02_23 {
public static void main (String args [ ]) {
    
    double w, x, y, z;
    
    w = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
    x = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número - maior q o primeiro"));
    y = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número - maior q os anteriores"));
    z = Double.parseDouble(JOptionPane.showInputDialog("Digite um quarto número, com qq valor"));
   
// não foi considerados valores iguais, já q é primícia q sejam diferentes
   if (z > y)
      {         
        JOptionPane.showMessageDialog(null,"A sequência dos números é: " + w + ", " + x + ", " + y + ", " + z);
      }
   else
      {        
            if (z > x)
              {         
                JOptionPane.showMessageDialog(null,"A sequência dos números é: " + w + ", " + x + ", " + z + ", " + y);
              }
            else
              {        
                    if (z > w)
                      {         
                        JOptionPane.showMessageDialog(null,"A sequência dos números é: " + w + ", " + z + ", " + x + ", " + y);
                      }
                   else
                      {        
                        JOptionPane.showMessageDialog(null,"A sequência dos números é: " + z + ", " + w + ", " + x + ", " + y);
                      }
              }
      }
 } 
} 


