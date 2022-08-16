

import javax.swing.JOptionPane;


public class Exerc06_lote2 {
    public static void main (String[] args){

        int n[] = new int[3];        
        int aux;

        for(int i=0; i<3; i++){
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + 
            (i + 1) + " o elemento do vetor."));
            System.out.println(i + " " + n[i]);
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(n[i]<n[j]) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
        }

        for (int i=0; i<3; i++) { 
            System.out.println(n[i]);
        }        
    }    
}
