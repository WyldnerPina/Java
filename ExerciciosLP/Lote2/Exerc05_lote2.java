
import javax.swing.JOptionPane;


public class Exerc05_lote2 {
    public static void main (String[] args){

        int n[] = new int[20];
        int somatorio = 0, k = 19;;

        for(int i=0; i<20; i++){
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + 
            (i + 1) + "º elemento do vetor."));
            System.out.println(i + " " + n[i]);
        }

        for(int i=0; i<10; i++){
            somatorio = somatorio + (n[i] - n[k]);            
            k--;
        }
        System.out.println("resultado = " + somatorio);
    }    
}
