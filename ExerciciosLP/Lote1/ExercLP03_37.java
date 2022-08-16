// Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

import javax.swing.*;

public class ExercLP03_37 {
    public static void main (String args [ ]) {
        int num, cont = 1, sequencia = 1, numDuasAntigo = 0, numUmaAntigo = 0;
        
        num = Integer.parseInt( JOptionPane.showInputDialog ("Digite um número") );
        System.out.print(sequencia + " - ");
        while (cont < num){            
            numDuasAntigo = numUmaAntigo;
            numUmaAntigo = sequencia;
            sequencia = numDuasAntigo + numUmaAntigo;
            cont++;
            System.out.print(sequencia + ", ");
        }
    }
}