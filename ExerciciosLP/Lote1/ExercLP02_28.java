// Receba o preço atual e a média mensal de um produto. Calcule e mostre o 
// novo preço sabendo que:
// Venda Mensal         Preço Atual      Preço Novo
// < 500                   < 30        +     10%
// >= 500 e < 1000      >= 30 e < 80   +     15%
// >= 1000                 >= 8        -     5%
// Obs.: para outras condições, preço novo será igual ao preço atual

import javax.swing.*;

public class ExercLP02_28 {
public static void main (String args [ ]) {
    
    double precoAtual, medMensal, novoPreco;
    
    precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
    medMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
   
   if ((medMensal < 500) && (precoAtual < 30))
      {
        novoPreco = precoAtual + (precoAtual * 0.1); 
        JOptionPane.showMessageDialog(null,"O novo preço é: " + novoPreco);
      }
   else
      {  
        novoPreco = precoAtual;
        JOptionPane.showMessageDialog(null,"não há reajuste de preço: " + novoPreco);
      }


//=========================================================================================================
    if ((medMensal >= 500) && (medMensal < 1000) && (precoAtual >= 30)  && (precoAtual < 80))
      {
        novoPreco = precoAtual + (precoAtual * 0.15); 
        JOptionPane.showMessageDialog(null,"O novo preço é: " + novoPreco);
      }
   else
      {  
        novoPreco = precoAtual;       
        JOptionPane.showMessageDialog(null,"não há reajuste de preço: " + novoPreco);
      }


//=========================================================================================================
    if ((medMensal >= 1000) && (precoAtual >= 80))
      {
        novoPreco = precoAtual - (precoAtual * 0.05); 
        JOptionPane.showMessageDialog(null,"O novo preço é: " + novoPreco);
      }
   else
      {  
        novoPreco = precoAtual;       
        JOptionPane.showMessageDialog(null,"não há reajuste de preço: " + novoPreco);
      }
 } 
} 


