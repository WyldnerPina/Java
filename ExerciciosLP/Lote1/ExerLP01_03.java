// Receba a base e a altura de um triângulo. Calcule e mostre a sua área

import javax.swing.JOptionPane;

public class ExerLP01_03{    
   public static void main (String args [ ])
     {
       double base, altura, area;
       base = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a base: "));
       altura = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a altura: "));
       area = (base * altura)/2;
      JOptionPane.showMessageDialog(null,"A área do triangulo é: " + area);
    } 
} 

