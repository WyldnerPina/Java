// Receba o número da base e do expoente. Calcule e mostre o valor da potência.
// OBS: DAVA PRA FAZER SÓ COM UMA LINHA SEM O LOOP.
import javax.swing.*;

public class ExercLP03_44 {
public static void main (String args [ ]) {
    
    double bs, exp, result = 1, control = 1;
    bs = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
    exp = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente"));

    while (control <= exp){
        result = result * bs;       
        control++;
    }
    System.out.println("resultado: " + result);
 }
}