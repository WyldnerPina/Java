// Receba 100 números inteiros reais. Verifique e mostre o maior e o menos 
// valor. Obs.: somente valores positivos.

import javax.swing.*;

public class ExercLP03_38 {
public static void main (String args [ ]) {
    
int n, maior = 0, menor = 0;
       
    for (int i=0; i<100; i++){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + " número"));
        if ((n > maior) || (i == 0)){
            maior = n;
        }

        if ((n < menor) || (i == 0)){
            menor = n;
        }                  
    }
    System.out.println("maior: " + maior + ", menor: " + menor);
 }
}