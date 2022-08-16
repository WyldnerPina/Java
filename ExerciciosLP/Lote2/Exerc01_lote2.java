// Criar e coletar um vetor [50] inteiro. Calcular e exibir:
// a. A média dos valores entre 10 e 200;
// b. A soma dos números ímpares.

import javax.swing.JOptionPane;

public class Exerc01_lote2 {
    public static void main (String[] args){

        int n[] = new  int[50];
        double media = 0, soma = 0, a = 0; 

        for(int i=0; i<50; i++){
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + 
            (i + 1) + " o elemento do vetor."));
            System.out.println(i + " " + n[i]);
        }


        for(int i=0; i<50; i++){
            if ((n[i] >= 10) && (n[i] <= 200)){
                media = media + n[i];
                a++;
            }            

            if (((n[i] % 2) != 0)){
                soma = soma + n[i];
            }
        }
        media = media / a;
        System.out.println("media dos números entre 10 e 200 = " + media + "\ne a soma dos ímpare = " + soma);
    }
}
