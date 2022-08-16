// Receba um número inteiro. Calcule e mostre o seu fatorial

import javax.swing.*;

public class ExercLP03_32 {
public static void main (String args [ ]) {
    
    int a, fat = 1, cont = 1;
    
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
    
   do
   {
      fat = cont * fat;
      cont = cont + 1;      
   }while (cont <= a);
    System.out.println("o fatorial é: " + fat);
 }
}