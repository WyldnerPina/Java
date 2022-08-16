// Receba 2 valores reais. Calcule e mostre o maior deles

import javax.swing.*;

public class ExercLP02_19 {
public static void main (String args [ ]) {
    
    double x, y; // tbm podia ser int, mas tô reaproveitando códigos :)
    
    x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
    y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
   
   if (x > y)
      {
        JOptionPane.showMessageDialog(null,"o mairo dos dois é " + x);
      }
   else
      {
        JOptionPane.showMessageDialog(null,"o mairo dos dois é " + y);
      }
 } 
} 


