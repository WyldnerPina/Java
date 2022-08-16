// Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

import javax.swing.*;

public class ExercLP03_45 {
public static void main (String args [ ]) {
    
    double result = 0;
    
    for (int i=1; i<=15; i++){
        if ((i % 2) == 0){
            result = result - (i / (Math.pow(i ,2)));
        }
        else{
            result = result + (i / (Math.pow(i ,2)));    
        }                                           
    }
    System.out.println(result);
 }
}