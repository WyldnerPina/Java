//Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%

import javax.swing.JOptionPane;

public class ExerLP01_02{ 
    
   public static void main (String args [ ])
     {
        double Sal,SalReajust;
        Sal = Double.parseDouble(JOptionPane.showInputDialog("Digite um salário: "));
        SalReajust  = Sal * 1.15;
        JOptionPane.showMessageDialog(null,"SALÁRIO COM REAJUSTE  " + SalReajust);
    } 
} 

