// Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e 
// mostre o resultado da somatória dos números ímpares entre esses valores

import javax.swing.*;

public class ExercLP03_35 {
public static void main (String args [ ]) {
    
    int a, b, soma = 0;
    
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
    
   if (a > b)
      {
        while (b <= a){
            if((b % 2) != 0){
                soma = soma + b; 
            }            
            b = b + 1;
        }
                
      }
   else
      {
        while (a <= b){
            if((a % 2) != 0){
                soma = soma + a; 
            }            
            a = a + 1;
        }
      }
    System.out.println("resultado: " + soma);
 }
}