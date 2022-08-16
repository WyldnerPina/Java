// Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

import javax.swing.*;

public class ExercLP03_42 {
public static void main (String args [ ]) {
    
   double soma = 0, a =1;
 
   for (int i=1; i<=50; i++){
        soma = soma + (i / a);               
        System.out.println(i + "/" + a + " = " + soma);
        a = a + 2;                           
   }  
 }
}