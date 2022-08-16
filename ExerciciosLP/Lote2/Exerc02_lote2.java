// Criar e coletar um vetor [100] inteiro e exibir:
// a. O maior e o menor valor;
// b. A média dos valores.

import javax.swing.JOptionPane;

public class Exerc02_lote2 {
    public static void main (String[] args){

        int n[] = new  int[100];
        double menor = 0, maior = 0, media = 0, vezes = 0; 

        for(int i=0; i<100; i++){
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + 
            (i + 1) + " o elemento do vetor."));
            System.out.println(i + " " + n[i]);
        }

        for(int i=0; i<100; i++){            
            if (i == 0){
                menor = n[i];
                maior = n[i];
            }
            else{
                if (n[i]< menor){
                    menor = n[i];
                }
                if (n[i] > maior){
                    maior = n[i];
                }
            }
            media = media + n[i];
            vezes++; 
        }
        media = media / vezes;
        System.out.println(maior + " " + menor + " " + media);        
    }
}
