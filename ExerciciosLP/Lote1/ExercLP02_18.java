// Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do 
// maior pelo menos valor

import javax.swing.*;

public class ExercLP02_18 {
public static void main (String args [ ]) {
    
    double x, y, result; // podia ser inteiro, mas como não especifica
    
    x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
    y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
   
   if (x > y)
      {
        result = x - y; 
        JOptionPane.showMessageDialog(null,"A diferença entre os números é: " + result);
      }
   else
      {
        result = y - x; 
        JOptionPane.showMessageDialog(null,"A diferença entre os números é: " + result);
      }
 } 
} 


