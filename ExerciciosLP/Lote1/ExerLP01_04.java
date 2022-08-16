// Receba a temperatura em graus Celsius. Calcule e mostre a sua 
// temperatura convertida em fahrenheit F = (9*C+160) /5

import javax.swing.JOptionPane;
public class ExerLP01_04 {
   
    public static void main (String args [ ])
     {
       double cel,fah;
       cel  = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em Celsius: "));        
       fah = (9 * cel + 160) / 5;
       JOptionPane.showMessageDialog(null,"MOSTRAR GRAUS FAHRENHEIT " + fah);

     }
}
