// Receba 2 números reais. Calcule e mostre a diferença desses valores.

// acredito q nesse exercício seja pedido apenas uma subtração e não o módulo do número.
// então, o resultado pode ser a diferença normal, com negativo. e não a diferença entre os números

import javax.swing.JOptionPane;
public class ExerLP01_10 {
   
    public static void main (String args [ ])
     {
       double num1,num2, subt;
       num1  = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));        
       num2  = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: ")); 
       subt = num1 - num2;
       JOptionPane.showMessageDialog(null,"A diferença entre os valores é de: " + subt);

     }
}