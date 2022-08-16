/*
    ================ 26/05 - N2 =====================
    VARIÁVEIS HETEROGÊNIAS - é uma variável de memória onde seus conteúdos
    podem ter tipos diferentes. (Homogênia são as matrizes e vetores)
registro lógico - cada linha 
    exemplo: aluno
    cod | nome | pontos - aqui são as linhas
    int  string  int - aqui o tipo de cada linha
é só uma tabela pra dizer os tipos como exemplo

Aluno é o nome do buffer (área de memória q vc pega informação q está na memória e trazer pra um arquivo físico
ela fica então preparada pra fazer o output qndo ele joga da sua memória para o dispositivo externo é uma write
uma vez q "imprimiu" ele pode fazer o sentido inverso, qndo isso acontece os dados externos entram para a memória
é o Input (uma leitura Read) I/O.
qndo a área de buffer fica carregada o pc fica meio travado. qndo vai imprimir por exemplo.


arquivo registro lógico aluno - no siga.

 */
import java.io.*;	
import javax.swing.*;


public class RegistroLogico {
    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[3]; // A maiúsculo representa uma classe, está instanciando → CHAMADO AQUI
        // a classe aqui, e todos os atributos lá são chamados aqui
        // O NÚMERO 3 representa os três alunos.
        int i;	
        
        for (i = 0 ; i < 3 ; i++){	
            aluno[i] = new Aluno();// o método lá embaixo  é chamado no "aluno ()"→ O MÉTODO 
        }// aqui é só pra limpar a memória de cada, q têm três campos. SE NÃO LIMPAR DÁ ERRO
	
        for (i = 0 ; i < 3 ; i++)//AQUI É O LOOP pra receber os valores nos campos.
        {	
            aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
            aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
            aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos Graduação do aluno:"));// não esquecer de 
            // fazer a conversão já q o terceiro é um valor inteiro
        }	
  	
        
        // aqui é pra exibir os resultados de aluno
        for (i = 0 ; i < 3; i++) {	
            System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
        }
  
        System.exit(0);	
        } // fim do método	

  } // fecha a classe      
        
    
    
    
class Aluno {	 // classe abstrata sem publico
    
    // aqui são os atributos da classe
    String pnome; //primeiro nome do tipo string	 
    String unome; // segundo nome tbm string
    int pontos; // pontuação do tipo inteira

    // construtor	 
    Aluno () {	//→ O MÉTODO 
        // qndo chamado ele limpa os campos colocando nos lugares nada, nada e zero
       this("","",0);	 
    }	 
    // polimorfismo é qndo juntamos dois tipos diferentes 

    // esse é outro método diferente
    // aqui cada linha é chamada NO LOOP pra receber valores, e os valores de cada linha são atualizados
    Aluno (String pnomealuno, String unomealuno, int pontosaluno){ //→CHAMANDO AQUI	 
        pnome   = pnomealuno;	 
        unome  = unomealuno;	 
        pontos  = pontosaluno;	 
    }	 
}

        
/* EXERCÍCIO
Criar uma classe abstrata conforme: 

trânsito 2021
cód cidade | nome cidade | qtidade acidentes
    int         String      int

criar uma classe com o nome registro transito. java
a - cadastrar 5 cidades (todos os campos)
b - mostrar registros cadastrados
c - mostrar a cidade e todos seus campos com maior e menor número de acidentes

*/        
        
        
   
  
