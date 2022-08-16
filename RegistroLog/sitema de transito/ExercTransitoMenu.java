
import javax.swing.JOptionPane;

public class ExercTransitoMenu {
    public static void main(String[] args) {
        int i, giros = 5;
        ExercTransitoClasseEstatistica[] estatistica = new ExercTransitoClasseEstatistica[giros];
        ExercTransitoMetodos meusMetodos = new ExercTransitoMetodos();
                
        for (i = 0 ; i < giros ; i++){
            estatistica[i] = new ExercTransitoClasseEstatistica();            
        }
                
//============================================== MENU =================================================
        int opc = 0 ;
        while (opc!=9){
        opc = Integer.parseInt(JOptionPane.showInputDialog(""
                + "1 - Cadastro Estatística \n "
                + "2 - Consulta por tipo de veículo \n "
                + "3 - Consulta por quantidade de acidentes \n "
                + "4 - Consulta todos as linhas \n "
                + "5 - Consulta maior, menor e média de acidentes \n "
                + "9 - Finaliza"));
            switch (opc) {
                case 1: estatistica = meusMetodos.FuncCadastrar(estatistica, giros);// CHAMADA FUNÇÃO
                        break;
                case 2: meusMetodos.FuncConsultarVeiculo(estatistica, giros);// CHAMADA PROCEDIMENTO
                        break;
                case 3: meusMetodos.FuncQntidadeAcidentes(estatistica, giros);// CHAMADA PROCEDIMENTO
                        break;
                case 4: meusMetodos.FuncConsultarTudo(estatistica, giros);// CHAMADA PROCEDIMENTO
                        break;
                case 5: meusMetodos.FuncMaiorMenorMedia(estatistica, giros);// CHAMADA PROCEDIMENTO
                        break;                        
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                        break;
                default:JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
    
    }
}
