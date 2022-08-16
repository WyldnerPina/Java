import java.util.Scanner;
import javax.swing.JOptionPane;

public class CaseIntervalo {

    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota"));
        
  

        switch ((1 <= n && n <= 5 ) ? 0 : (6 <= n && n <= 10) ? 1 : 2) {

            case 0:
                System.out.println("I'm between one and five inclusive.");
                break;
            case 1:
                System.out.println("I'm between 6 and 10 inclusive.");
                break;
            case 2:
                System.out.println("I'm not between one and five or 6 and 10 inclusive.");
                break;
        }
    }
}