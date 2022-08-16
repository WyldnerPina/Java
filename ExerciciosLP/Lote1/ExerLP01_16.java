// Receba a quantidade de horas trabalhadas, o valor por hora, o percentual 
// de desconto e o número de descendentes. Calcule o salário que serão as 
// horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário 
// Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário 
// Líquido. Exiba o salário a receber.

import javax.swing.JOptionPane;
public class ExerLP01_16 {
   
    public static void main (String args [ ])
     {
       double htrab, valorh, desc, dependentes, sal, salliq;
       htrab  = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));        
       valorh  = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora: "));        
       desc  = Double.parseDouble(JOptionPane.showInputDialog("Digite o desconto: "));
       dependentes  = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de dependentes: "));

       sal = (htrab * valorh);
       salliq = sal - desc; // só coloquei separado já que, pelo enunciado, conclui-se q é pra fazer separado
       salliq = salliq + (dependentes * 100);

       JOptionPane.showMessageDialog(null,"Seu salário final é de: " + salliq);
     }
}