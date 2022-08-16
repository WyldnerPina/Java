// Receba os coeficientes A, B e C de uma equação do 2º grau 
// (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a 
// equação possue2 raízes)

import javax.swing.JOptionPane;
public class ExerLP01_05 {
   
    public static void main (String args [ ])
     {
       double a, b, c, x1, x2, del;
       a  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
       b  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
       c  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
       
       del = (Math.pow(b ,2))-(4 * a * c);
       x1 = ((-b) + Math.sqrt(del))/(2*a);
       x2 = ((-b) - Math.sqrt(del))/(2*a);
       
       
       JOptionPane.showMessageDialog(null,"O resultado para x1: " + x1 + ". O resultado para x2: " + x2);

     }
}