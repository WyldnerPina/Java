// Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.

import javax.swing.JOptionPane;
public class ExerLP01_12 {
   
    public static void main (String args [ ])
     {
       int anasc, aatual, mais17, idd;
       anasc  = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de sua nascimento: "));        
       aatual  = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));        
       idd = aatual - anasc;
       mais17 = idd + 17;
       JOptionPane.showMessageDialog(null,"Sua idade é de: " + idd + ", e daqui a 17 anos será de: " + mais17);
     }
}