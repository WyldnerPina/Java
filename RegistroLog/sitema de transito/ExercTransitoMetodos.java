import javax.swing.JOptionPane;

public class ExercTransitoMetodos {
     
//====================================================================================================
//============================================ CADASTRAR =============================================
//====================================================================================================    
    public ExercTransitoClasseEstatistica[] FuncCadastrar(ExercTransitoClasseEstatistica[] cadastrarEst,int giros){
        int i;

        // CADASTRANDO ESTÁTISTICAS
        for (i = 0; i < giros ; i++)
        {
            cadastrarEst[i].codcity = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade:"));
            cadastrarEst[i].namecity = JOptionPane.showInputDialog("Digite o nome da cidade:");
            cadastrarEst[i].crashes =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colisoes:"));
            cadastrarEst[i].car = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do carro:"));
        }  
        return cadastrarEst;
    } 
   
//====================================================================================================
//================================== CONSULTAR TIPO DE VEICULO =======================================
//====================================================================================================    
    public void FuncConsultarVeiculo(ExercTransitoClasseEstatistica[] tipoVeiculo, int giros){
        int i, consult;

        System.out.println("=============================================================");
        System.out.println("Lista das cidades para consulta do tipo de veículo");

        for (i = 0; i < giros; i++) 
        {
            System.out.println("Cidade " + (i+1) + tipoVeiculo[i].namecity);
        }

        // ESSA ESCOLHA NÃO PEDE NO EXERCÍCIO, 
        //mas com os números e cidades correspondentes q aparecem no loop acima
        // é possível escolher se vc quer q todos apareçam ou somente o tipo de uma cidade
       consult = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da cidade correspondente \n"
        + "ou ditite zero para mostrar todos"));

        if (consult == 0){
            for (i = 0; i < giros; i++) 
            {
                System.out.println((i+1) + "Cidade " + tipoVeiculo[i].namecity + 
                                           " Tipo do Veículo:  = " +  tipoVeiculo[i].car);
            }        
        }
        else{
            System.out.println((i+1) + "Cidade " + tipoVeiculo[consult - 1].namecity + 
            " Tipos de Veículos:  = " +  tipoVeiculo[consult - 1].car);
        }
    } 

//====================================================================================================
//=============================== CONSULTAR QNTIDADE DE ACIDENTES ====================================
//====================================================================================================    
    public void FuncQntidadeAcidentes(ExercTransitoClasseEstatistica[] acidentes, int giros){
        int i;

        System.out.println("=============================================================");
        System.out.println("Quantidade de acidentes cadastrados \n- com suas respectivas cidades -\n"
                            + "entre 100 e 500");

        for (i = 0; i < giros; i++) 
        {
            if(acidentes[i].crashes > 100 && acidentes[i].crashes < 500){
                System.out.println(acidentes[i].namecity + ": " + acidentes[i].crashes);
            }
        }
    }
    
//====================================================================================================    
//======================================== CONSULTAR TUDO ============================================
//====================================================================================================
    public void FuncConsultarTudo(ExercTransitoClasseEstatistica[] consultar, int giros){
        int i;

        System.out.println("=============================================================");
        System.out.println("Seguem todos os cadastros:");

        for (i = 0; i < giros; i++) 
        {
            System.out.println(consultar[i].codcity + " - "
                    + consultar[i].namecity + " - "
                    + consultar[i].crashes + " - "
                    + consultar[i].car);
        }
    }

//====================================================================================================    
//======================== CONSULTAR MAIOR, MENOR E ACIMA DA MÉDIA EM ACIDENTES ======================
//====================================================================================================
    public void FuncMaiorMenorMedia(ExercTransitoClasseEstatistica[] escolhidos, int giros){
        int i;

        for (i = 0; i < giros; i++) 
        {
            System.out.println(escolhidos[i].car);
        }
    }
}
