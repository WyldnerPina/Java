// Calcule e mostre o quadrado dos números entre 10 e 150


// https://www.ev.org.br/cursos/linguagem-de-programacao-java-basico até 07/04

import javax.swing.*;

public class ExercLP03_31 {
public static void main (String args [ ]) {
    
    int num = 10, quad;
    
    while (num >= 10 && num <=150)
    {
        quad = num * num;
        System.out.println("o quadrado de " + num + "e: " + quad);
        
        num = num + 1;
    }
 }
}