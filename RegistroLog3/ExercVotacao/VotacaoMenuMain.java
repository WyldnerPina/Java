import java.io.IOException;
import javax.swing.JOptionPane;
/*
 ============================ CLASSE PRINCIPAL ==============================
 */
public class VotacaoMenuMain {
    public static void main(String[] args) throws IOException {
        int i, opcaoMenu = 0, giros = 300;
        Votacao[] votacao = new Votacao[giros];
        Votacao2016 metodosVotacao = new Votacao2016();
        
        for (i = 0 ; i < giros ; i++){
            votacao[i] = new Votacao();            
        }
        
        do {
            opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(""
                + "================================\n"
                + "             SISTEMA DE VOTAÇÃO\n\n"
                + "     1 - Carregar Seção/Número Eleitor\n "
                + "    2 - Classificar por Seção\n "
                + "    3 - Gravar Registros\n "
                + "    4 - Mostrar Indicadores\n"
                + "     9 - Finaliza\n"
                + "================================\n" ));
//===================================================== MENU ================================================================================
            switch (opcaoMenu) {
                case 1: votacao = metodosVotacao.FuncCadastrar(votacao, giros);
                        JOptionPane.showMessageDialog(null,"Cadastro Efetuado");                        
                        break;
                case 2: votacao = metodosVotacao.FClassificaSecao(votacao, giros);
                        JOptionPane.showMessageDialog(null,"Dados classificados");                        
                        break;
                case 3: metodosVotacao.FGravaVotacao(votacao, giros);
                        JOptionPane.showMessageDialog(null,"Arquivo Gerado");                        
                        break;
                case 4: metodosVotacao.FIndicadores(votacao, giros); 
                        break;                       
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                        break;
                default:JOptionPane.showMessageDialog(null,"Opção Inválida");
            }        
        }while(opcaoMenu != 9);
    
    }
}
