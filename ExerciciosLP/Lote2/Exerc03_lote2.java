// Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar 
// esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
// VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6

import javax.swing.JOptionPane;


public class Exerc03_lote2 {
        public static void main (String[] args){

        int n1[] = new  int[3];
        int n2[] = new  int[3];
        int n3[] = new  int[6];
        double menor = 0, maior = 0, media = 0, vezes = 0; 

        for(int i=0; i<3; i++){
            n1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + 
            (i + 1) + "o elemento do vetor."));
            System.out.println(i + " " + n1[i]);
        }

        for(int i=0; i<3; i++){
            n2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + 
            (i + 1) + " o elemento do vetor."));
            System.out.println(i + " " + n2[i]);
        }

        for(int i=0; i<6; i++){
            if (i < 3){
                n3[i] = n1[i];
            }
            else{
                n3[i] = n2[i - 3];
            }
        }
        for(int i=0; i<6; i++){            
            System.out.print(n3[i]);
        }
    }
}
