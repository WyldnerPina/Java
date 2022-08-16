    
import javax.swing.JOptionPane;

/// recusividade: é um função q chama ela mesma até que uma condição seja satisfeita


public class Recursividade {
     public static void main (String[] args){
         int num, n1;
         
         n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
         num = ffat(n1);
         System.out.println(num);
    }
   

    public static int ffat (int n){
        int f;
       
        if(n != 1){            
            f = n * ffat(n-1);
            System.out.println(f);
            return f;            
        }
        else{
            
            return 1;
        }

    }
}