//Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.

import javax.swing.JOptionPane;
// em todos os exercícios não estou levando em consideração o tratamento do nulo, números negativos 
// ou fracionários. Por isso, o uso de variáveis inteiras qndo possível e variáveis reais.
// qndo havia divisão, mas ainda assim não arrumei erros com o zero ou negativos. 
// (tbm não arrumei arredondamentos)
public class ExerLP01_01{    
   public static void main (String args [ ])
     {
       int lado,area;
       lado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o lado do quadrado: "));
       area = (lado * lado);
      JOptionPane.showMessageDialog(null,"A área do quadrado é: " + area);
    } 
} 
    
