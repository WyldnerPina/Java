// Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.

import javax.swing.JOptionPane;
public class ExerLP01_14 {
   
    public static void main (String args [ ])
     {
       int ang1, ang2, ang3;
       ang1  = Integer.parseInt(JOptionPane.showInputDialog("Digite um ângulo: "));        
       ang2  = Integer.parseInt(JOptionPane.showInputDialog("Digite outro ângulo: "));  
      
       ang3 = 180 - ang1 - ang2;  // legando em consideração q será digitado apenas valores em graus
     
       JOptionPane.showMessageDialog(null,"O outro ângulo tem o valor de: " + ang3);
     }
}