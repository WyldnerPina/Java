// Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência

import javax.swing.JOptionPane;
public class ExerLP01_11 {
   
    public static void main (String args [ ])
     {
       double raio, comp;
       raio  = Double.parseDouble(JOptionPane.showInputDialog("Digite raio: "));    
       
       comp = 2 * Math.PI * raio;
       JOptionPane.showMessageDialog(null,"O comprimento de sua circunferência é de: " + comp);

     }
}