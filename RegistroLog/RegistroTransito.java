
import java.io.*;	
import javax.swing.*;


public class RegistroTransito {
    public static void main(String[] args) {
        Cidade[] cidade = new Cidade[3];
        int i;	
        
        // LIMPA
        for (i = 0 ; i < 3 ; i++){	
            cidade[i] = new Cidade();
        }

        // INSERE DADOS	
        for (i = 0 ; i < 3 ; i++)
        {	
            cidade[i].codcity = Integer.parseInt(JOptionPane.showInputDialog("Entre o código da cidade:"));	
            cidade[i].namecity = JOptionPane.showInputDialog("Entre o nome da cidade:");	
            cidade[i].crashes = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade de acidentes:"));
        }	
  	
        // APRESENTA DADOS                
        for (i = 0 ; i < 3; i++) {	
            System.out.println(cidade[i].codcity + " " + cidade[i].namecity + " pontos: " + cidade[i].crashes);	
        }
  
        System.exit(0);	
        }	

  }       
        
    
    
    
class Cidade {	 
    int codcity;	 
    String namecity;
    int crashes;

    //CHAMADO PARA LIMPAR ESPAÇOS - inicializa os campos na memória antes de vc utilizá-lo.
    // método construtor, não acontece em matrizes pq vc inicia como nulo (null), como aqui 
    // são diferentes precisa fazer assim.
    Cidade () {
       this(0,"",0);	 
    }	 
    
    // TRÊS VARIAVEIS DIFERENTES EM UM TIPO DE MATRIZ, cada uma uma coluna.
    // sendo 3 linhas definidas lá em cima. 
    Cidade (int codcidade, String nomecidade, int colisoes){	 
        codcity = codcidade;	 
        namecity  = nomecidade;	 
        crashes  = colisoes;	 
    }	 
}

