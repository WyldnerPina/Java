// Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa

import javax.swing.JOptionPane;
public class ExerLP01_15 {
   
    public static void main (String args [ ])
     {
       double cat1, cat2, hip;
       cat1  = Double.parseDouble(JOptionPane.showInputDialog("Digite um dos catetos: "));        
       cat2  = Double.parseDouble(JOptionPane.showInputDialog("Digite o outro: "));        
       hip = Math.sqrt((cat1 * cat1)+(cat2 * cat2));
       
       JOptionPane.showMessageDialog(null,"A hipotenusa vale: " + hip);
     }
}