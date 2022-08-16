// Criar e coletar em um vetor [30] real e calcular e exibir:
// a. A média do grupo;
// b. A quantidade de notas acima do grupo;
// c. As posições dos valores abaixo da média do grupo.

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exerc04_lote2 {
    public static void main (String[] args){

        double n[] = new double[30];
        ArrayList<Integer> armaz = new ArrayList<>();
        
        double media = 0, acima = 0, posicao = 0, loop = 0; 
        
        for(int i=0; i<30; i++){
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da nota "));
            media = media + n[i];
            System.out.println(i + " " + n[i]);
            loop++;
        }
        media = media / loop;        
        
        for(int i=0; i<30; i++){            
            if(n[i] > media){
                acima++;                
            }
            if(n[i] < media){
                armaz.add(i);
            }            
        }
        System.out.println("media: " + media);
        System.out.println("qntidade de notas acima: " + acima);
        System.out.println("locais onde estao no vetor as notas abaixo da média: " + armaz);        
    }    
}


// recusividade: é um função q chama  mesma até que uma condição seja satisfeita