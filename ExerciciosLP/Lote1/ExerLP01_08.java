// Receba o valor de um depósito em poupança. Calcule e mostre o valor 
// após 1 mês de aplicação sabendo que rende 1,3% a. m

import javax.swing.JOptionPane;
public class ExerLP01_08 {
   
    public static void main (String args [ ])
     {
       double dp,dpfinal;
       dp  = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor do depósito: "));        
       dpfinal = dp * 1.013; // como o exercício não pede pra ver vários meses, optei por fazer apenas o primeiro
       JOptionPane.showMessageDialog(null,"o resultado após 1 mês: " + dpfinal);
// aqui é possível dar aquele erro de arredondamento clássico.
     }
}
