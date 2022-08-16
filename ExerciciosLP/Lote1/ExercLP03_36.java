// Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

import javax.swing.*;

public class ExercLP03_36 {
public static void main (String args [ ]) {
    
    double n, fat, cont, volta = 1, soma = 0;
    
    n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número "));
    while (volta <= n){        
            fat = 1;
            cont = 1;
            do{
                fat = cont * fat;
                cont = cont + 1;                               
            }while (cont <= volta);                          
             
            soma = soma + (1 / fat);            
            volta = volta + 1;                      
   }
    System.out.println("a somatória é: " + soma);
 }
}