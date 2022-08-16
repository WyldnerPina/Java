// Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias 
// durará esse alimento sabendo que a pessoa consome 50g ao dia

import javax.swing.JOptionPane;
public class ExerLP01_13 {
   
    public static void main (String args [ ])
     {
       double alimentos, dias;
       alimentos  = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos (em quilos): "));        
       dias = (alimentos * 1000)/ 50;     
       
       JOptionPane.showMessageDialog(null,"O alimento durará " + dias + " dias.");
     }
}