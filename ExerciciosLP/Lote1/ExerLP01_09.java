// Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados

import javax.swing.JOptionPane;
public class ExerLP01_09 {
   

    public static void main (String args [ ])
     {
       int num1,num2, somaQuad;
       num1  = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));        
       num2  = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));        
       somaQuad = (num1*num1) + (num2*num2);
       JOptionPane.showMessageDialog(null,"A soma dos quadrados dos números é: " + somaQuad);
     }
}