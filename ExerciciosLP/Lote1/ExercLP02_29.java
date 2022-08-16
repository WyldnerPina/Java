// Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do 
// investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a 
// poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.

import javax.swing.*;

public class ExercLP02_29 {
public static void main (String args [ ]) {
    
    double tipo, valorInvestido, result;
    
    tipo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento \n 1 - poupança \n 2 - renda fixa"));
    // \n pula linha


      if (tipo == 1 || tipo ==2)
      {         
        

                // dá pra usar html pra formatar um texto.
                //JOptionPane.showMessageDialog(null, "&lt;html&gt;&lt;body&gt;Salário: " + variável + "<br>" + "Salário <b>acrescido</b> de <b>15%</b> ");
                valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));

                // como é só 1 mês fiz a conta só pra esse mês. e considerei a taxa ao mês.
                // utilizei essa estrutura, pois é um caso de "case", então deixei a estrutura parecida.   
                if(tipo == 1)
                   {
                     result = valorInvestido * 1.03;
                     JOptionPane.showMessageDialog(null,"O valor após um mês na poupança = " + result);
                   }
                if(tipo == 2)
                   {
                     result = valorInvestido * 1.05;
                     JOptionPane.showMessageDialog(null,"O valor após um mês em renda fixa = " + result);
                   }
     }
     else
     {
        JOptionPane.showMessageDialog(null,"tipo de investimento não válido ");
     }
 } 
} 


