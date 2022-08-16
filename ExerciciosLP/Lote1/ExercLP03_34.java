// Receba um número. Calcule e mostre os resultados da tabuada desse número

import javax.swing.*;

public class ExercLP03_34 {
public static void main (String args [ ]) {
    
    int a, cont = 0, tab;
    
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite "));
    
   while (cont <= 10 ) {
            tab = a * cont;            
            System.out.println(a + " x " + cont + " = " + tab);
            cont = cont + 1;
        }
 }
}