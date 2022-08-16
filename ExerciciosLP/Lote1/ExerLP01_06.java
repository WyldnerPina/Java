// Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

import javax.swing.JOptionPane;

public class ExerLP01_06 {
   
    public static void main (String args [ ])
     {
// aqui eu poderia já receber em variável trocada, mas acredito q essa não era a intenção do exercício
       int x, y, apoio;
       x  = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
       y  = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
       
       apoio = x;
       x = y;
       y = apoio;
       JOptionPane.showMessageDialog(null,"O valor de x agora é o de y: " + x + ", e o valor de y é o de x: " + y);

     }
}
