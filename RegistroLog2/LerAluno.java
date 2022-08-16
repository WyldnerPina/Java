import java.io.*;	
//import javax.swing.*;	

class LerAluno	
{	

    public void LendoArqv ( String[] args ) throws IOException {	
        Aluno[] aluno = new Aluno[3];	
        int i,ptos;	
        String fileName = "ArquivoAluno.txt";	

        BufferedReader ler = new BufferedReader(new FileReader( fileName )); //aqui inicia a leitura no buffer	

        for (i = 0 ; i < 3 ; i++){//limpando àrea de memória com classe abstrata	
            aluno[i] = new Aluno();
        }

        for (i = 0 ; i < 3 ; i++){	
            aluno[i].pnome = ler.readLine();//pegando na memória e trazendo  	
            aluno[i].unome = ler.readLine();	
            aluno[i].pontos = Integer.parseInt(ler.readLine());	//aqui já trago convertendo já q foi gravado como string
        }	

        System.out.println("========== EXIBINDO O Q ESTÁ NO ARQUIVO ==========");
        for (i = 0 ; i < 3; i++) {//aqui exibe	
            System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
        }
        System.out.println("==================================================");
        
        
        ler.close();//precisa fechar tbm	
        System.exit(0);	
    } // fim do método	
} // fim da classe

