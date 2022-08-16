// Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
// Mostre a mensagem de acordo com a média:
// a. Se a média for >= 6,0 exibir “APROVADO”;
// b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
// c. Se a média for < 3,0 exibir “RETIDO”.

import javax.swing.*;


public class ExercLP02_21 {
public static void main (String args [ ]) {
    
    double n1, n2, n3, n4, med;
    
    n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
    n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
    n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
   
    med = (n1 + n2 + n3 + n4) / 4;
    JOptionPane.showMessageDialog(null,"Sua média foi de: " + med + " e vc está...");        

   if (med >= 6.0)
      {         
        JOptionPane.showMessageDialog(null,"APROVADO!");
      }
   else
      {
                if (med >= 3)
              { 
                JOptionPane.showMessageDialog(null,"EXAME!");
              }
           else
              { 
                JOptionPane.showMessageDialog(null,"RETIDO!");
              }
      }
 } 
} 


