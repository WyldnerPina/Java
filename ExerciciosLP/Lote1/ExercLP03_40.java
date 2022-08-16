// Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
// OBS: NÃO ESPECÍFICA SE O INTERVALO É ABERTO OU FECHADO 
import javax.swing.*;

public class ExercLP03_40 {
public static void main (String args [ ]) {
    
    double n1, n2, todos = 1, aux = 1, soma = 0;
    
    n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
    
    if (n1 < n2){
        while (n1 <= n2){            
            todos = 1;
            soma = 0;
            do{                
                if ((n1 % todos) == 0){
                    soma = soma + todos;
                }
                todos++;
            }while (todos <= n1);
            if (soma == (n1 + 1) || (soma == 1)){
                System.out.println("primo: " + n1);
            }
            n1++;
        }
    }
    else {
        while (n2 <= n1){            
            todos = 1;
            soma = 0;
            do{                
                if ((n2 % todos) == 0){
                    soma = soma + todos;
                }
                todos++;
            }while (todos <= n2);
            if (soma == (n2 + 1) || (soma == 1)){
                System.out.println("primo: " + n2);
            }
            n2++;
        }        
    }
 }
}