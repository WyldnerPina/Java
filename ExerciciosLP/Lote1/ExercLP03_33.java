// Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N

import javax.swing.*;

public class ExercLP03_33 {
public static void main (String args [ ]) {
    
    double a, soma = 0, z =1;
    
    a = Double.parseDouble(JOptionPane.showInputDialog("Digite "));
    
   while (z <= a) {
            soma = soma + (1 / z);
            z = z + 1;
        }
    System.out.println("resultado: " + soma);
 }
}