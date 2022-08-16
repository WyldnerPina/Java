
import java.io.*; // usado para 	
import javax.swing.*;	

//===========Será salvo em pasta acima da do código========

class GravaAluno	
{	
    public void grava (Aluno[] cadastrarEst,int giros ) throws IOException{//deixa como uma classe principal só pra testar	
        
        Aluno[] aluno = new Aluno[giros]; //qntidade de alunos	
        int i,ptos;	
        String fileName = "ArquivoAluno.txt"; // nome gerado como txt, no mesmo local do projeto
        //String fileName = "ArquivoAluno.pdf"; // dá pra salvar em outros formatos

        
        // aqui está abrindo a gravação
        BufferedWriter writer = new BufferedWriter(new FileWriter( fileName )); // aqui escreve o q está no buffer de uma vez
        // ajusta o fator de bloco (writer vc q escolhe o nome é o apelido, posso chamar "gravar").
        // BufferedWriter é um método para gravar

        for (i = 0 ; i < 3 ; i++){ // gerando os espaços	
            aluno[i] = new Aluno();
        }

        for (i = 0 ; i < 3 ; i++){	
            aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
            writer.write( aluno[i].pnome );  	
            writer.newLine();
            
            aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
            writer.write( aluno[i].unome );  	
            writer.newLine();
            
            // qndo for gravas sempre é como string, por isso a conversão aqui
            aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos Graduação do aluno:"));	
            writer.write(Integer.toString(aluno[i].pontos)); //conversão aqui    	
            writer.newLine();	
        }	

        for (i = 0 ; i < 3; i++) {	
            System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
        }

        writer.close();//qndo vc grava info em dispositivo físico, o buffer abre a gaveta e após é necessário fechar	
        // qndo inicia tem um tape mark no início e fim se não tiver o close o outro programa vai dar erro.
        // sempre tem um comando de abertura e fechamento
        System.exit(0);	// assim q executou o comando ele sai da virtual machine par ao SO
        
    } // fim do método	
} // fim da classe
