// Calcule e mostre quantos anos serão necessários para que Ana seja maior que 
// Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m 
// e cresce 2 cm ao ano.


import javax.swing.*;

public class ExercLP03_43 {
public static void main (String args [ ]) {
    
    int ana = 110, maria = 150, ano = 1;

    while (ana <= maria){            
            ana = ana + 3;
            maria = maria + 2;            
            ano = ano + 1;
    }
    System.out.println("Após " + ano + " anos");
 }
}