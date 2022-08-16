// Receba os valores do comprimento, largura e altura de um paralelepípedo. 
// Calcule e mostre seu volume

import javax.swing.JOptionPane;
public class ExerLP01_07 {
   
    public static void main (String args [ ])
     {
       double comp, larg, alt, vol;
       comp  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento: "));
       larg  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura: "));
       alt  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
       vol = comp * larg * alt;
       JOptionPane.showMessageDialog(null,"O volume do digitado é de: " + vol);

     }
}
