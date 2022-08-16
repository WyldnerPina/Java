// Receba o número de voltas, a extensão do circuito (em metros) e o tempo de 
// duração (minutos). Calcule e mostre a velocidade média em km/h

import javax.swing.*;

public class ExercLP02_27 {
public static void main (String args [ ]) {
    
    double voltas, extencao, duracao, vm;
    
    voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas"));
    extencao = Double.parseDouble(JOptionPane.showInputDialog("Digite a extenção do circuito (em metros)"));
    duracao = Double.parseDouble(JOptionPane.showInputDialog("Digite a duração da corrida (em minutos)"));
    
    extencao = extencao / 1000;
    duracao = duracao / 60;
    
    vm = (voltas * extencao) / duracao;
    JOptionPane.showMessageDialog(null,"A velocidade média é de: " + vm + "Km/h");   
 } 
} 


