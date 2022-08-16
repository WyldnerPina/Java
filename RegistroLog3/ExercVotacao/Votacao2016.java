/*
========================================= CLASSE DOS MÉTODOS ========================================
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Votacao2016 {
     
//====================================================================================================
//============================================ CADASTRAR =============================================
//====================================================================================================    
    public Votacao[] FuncCadastrar(Votacao[] registrarVoto,int giros){
        int i;
        Random gerador = new Random();
        // REGISTRANDO VOTOS
      
        for (i = 0; i < giros ; i++)
        {
            registrarVoto[i].numeroSecao = gerador.nextInt(10) + 1;
            registrarVoto[i].numeroCandidato = gerador.nextInt(300) + 1;
        }        
        return registrarVoto;        
    }
    
//====================================================================================================
//========================================= ORDENAR SEÇÃO ============================================
//====================================================================================================    
    public Votacao[] FClassificaSecao(Votacao[] secao,int giros){
        int i, j, cont = 0;
        int secaoOrdenado[] = new int[giros];
        int candidatoOrdenado[] = new int[giros];
        
        for (j = 0; j < 11 ; j++)
        {
            for (i = 0; i < giros ; i++)
            {
                if(secao[i].numeroSecao == j){
                        secaoOrdenado[cont] = secao[i].numeroSecao;
                        candidatoOrdenado[cont] = secao[i].numeroCandidato;
                        cont = cont + 1;
                }
            }
        }
        
        for (i = 0; i < giros ; i++)
        {
            secao[i].numeroSecao = secaoOrdenado[i];
            secao[i].numeroCandidato = candidatoOrdenado[i];
        }        
        return secao;       
    }

//====================================================================================================
//====================================== ESCREVER NO TXT =============================================
//====================================================================================================    
    public void FGravaVotacao(Votacao[] voto,int giros) throws IOException{
        int i;
        String fileName = "src/ArquivoVotacao.txt";
        
        BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));
       
        for (i = 0; i < giros ; i++)
        {            	
            writer.write("Seção: " + Integer.toString(voto[i].numeroSecao) + " - ");                       	
            writer.write("Candidato: " + Integer.toString(voto[i].numeroCandidato));  	
            writer.newLine();
        }
        writer.close();        
    }
    
//====================================================================================================
//====================== INDICADORES COM MENU E CHAMANDO OUTRA CLASSE DE MÉTODO ======================
//====================================================================================================    
    public void FIndicadores(Votacao[] tudo, int giros){
        int i, opc = 0;
        
        MeusMetodosVotacao metVotacao = new MeusMetodosVotacao();
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                + "==============================================\n"
                + "                 MOSTRAR INDICADORES\n"
                + "             Estátistica de votação em 2016\n\n"   
                + "     1 - Quantidade de eleitores por seção\n "
                + "    2 - Seção com Maior e Menor número de Eleitores\n "
                + "    3 - Quantidade de votos por candidato\n "
                + "    4 - 10 primeiros colocadas (nro  cand. e qtd votos )\n"
                + "     9 - Finaliza consulta\n"
                + "==============================================\n" ));
//============================================== MENU ================================================
            switch (opc) {
                case 1: metVotacao.FEleitoresSecao(tudo, giros);
                        break;
                case 2: metVotacao.FSecaoMaiorMenor(tudo, giros);                        
                        break;
                case 3: metVotacao.FQntidadeVotos(tudo, giros);//(votacao, giros); // CHAMADA PROCEDIMENTO
                        System.out.println("Arquivo Gerado");
                        break;
                case 4: metVotacao.FDezMais(tudo, giros);
                        break;                       
                case 9: break;
                default:JOptionPane.showMessageDialog(null,"Opção Inválida");
            }        
        }while(opc != 9);
    }
}