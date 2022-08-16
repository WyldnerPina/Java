// Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula 
// AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso 
// exista, calcule e mostre.

import javax.swing.*;

public class ExercLP02_20 {
public static void main (String args [ ]) {
    
    double a, b, c, x1, x2, del;
       a  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
       b  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
       c  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
       
       del = (Math.pow(b ,2))-(4 * a * c);
       
   
   if (del >= 0)
      {
        x1 = ((-b) + Math.sqrt(del))/(2*a);
        x2 = ((-b) - Math.sqrt(del))/(2*a);
        JOptionPane.showMessageDialog(null,"As raízes de sua equação são: " + x1 + ", " + x2);
      }
   else
      {         
        JOptionPane.showMessageDialog(null,"A equação não contém raízes reais");
      }
 } 
} 


