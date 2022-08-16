
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exerc08_lote2 {
    public static void main (String[] args){

        int n[][] = new int[4][3]; 
        ArrayList<Integer> arrayNome = new ArrayList<>();       
        int somaMes = 0, somaSemana = 0;

        for(int L=0; L<4; L++){            
            for(int C=0; C<3; C++){
                n[L][C] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));            
                System.out.print(n[L][C] + " ");
            }
            System.out.println();
        }

        for(int L=0; L<4; L++){            
            for(int C=0; C<3; C++){
                somaMes = somaMes + n[L][C];
                somaSemana = somaSemana + n[L][C];
            }
            arrayNome.add(somaSemana);
            somaSemana = 0;
        }
        System.out.println("somas semanais : " + arrayNome);
        //System.out.println(arrayNome.size());
        System.out.println("soma mensal = " + somaMes);
    }    
}