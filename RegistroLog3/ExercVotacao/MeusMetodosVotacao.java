/*
====================================== MÉTODOS DO SEGUNDO MENU =======================================
 */
public class MeusMetodosVotacao {    
//====================================================================================================
//====================================== ELEITORES POR SEÇÃO =========================================
//====================================================================================================
    public void FEleitoresSecao(Votacao[] dados, int giros){
        int i, j, contaEleitores = 0;
        
        for (j = 0; j < 11 ; j++)
        {
            for (i = 0; i < giros ; i++)
            {
                if(dados[i].numeroSecao == j){
                    contaEleitores = contaEleitores + 1;
                }      
            }
            System.out.println("Seção " + j + " contém " + contaEleitores + " eleitores");
            contaEleitores = 0;
        }
    }

//====================================================================================================
//====================================== SEÇÃO MAIOR E MENOR =========================================
//====================================================================================================
    public void FSecaoMaiorMenor(Votacao[] dados, int giros){
        int maior = 0, menor = 0, auxMenor = 0, auxMaior = 0, i, j, contaEleit = 0;

        for (j = 0; j < 11 ; j++)
        {
            for (i = 0; i < giros ; i++)
            {
                if(dados[i].numeroSecao == j){
                    contaEleit = contaEleit + 1;
                }      
            }

            if(j == 0){
                maior = menor = j;
                auxMaior = auxMenor = contaEleit;                
            }


            if (contaEleit > auxMaior){
                maior = j;
                auxMaior = contaEleit;
            }

            if (contaEleit < auxMenor){
                menor = j;
                auxMenor = contaEleit;                
            }
            contaEleit = 0;
        }
        System.out.println("A seção com maior número de eleitores é: " + maior);
        System.out.println("A seção com menor número de eleitores é: " + menor);       
    }

//====================================================================================================
//================================= QNTIDADE DE VOTOS POR CANDIDATO ==================================
//====================================================================================================
    public void FQntidadeVotos(Votacao[] candidados, int giros){
    int j, i, contaVotos = 0;
    int armazena[][] = new int [giros][2];
    

            for (j = 0; j < giros ; j++)
            {
                for (i = 0; i < giros ; i++)
                {
                    if(candidados[i].numeroCandidato == j){
                        contaVotos = contaVotos + 1;
                    }      
                }                
                armazena [j][0] = j;
                armazena [j][1] = contaVotos;
                System.out.println("candidato " + j + " obteve " + contaVotos + " votos");

            contaVotos = 0;
            }        
    }

//====================================================================================================
//====================================== OS DEZ MAIS VOTADOS =========================================
//====================================================================================================
    public void FDezMais(Votacao[] dados, int giros){
        int i, j, contaVotos = 0, auxCand, auxVotos; 
        int posicoes[][] = new int [10][2];
        int armazena[][] = new int [giros][2];

        System.out.println("========================================================================");
        for (j = 0; j < giros ; j++)
        {
            for (i = 0; i < giros ; i++)
            {
                if(dados[i].numeroCandidato == j){
                    contaVotos = contaVotos + 1;
                }      
            }                
            armazena [j][0] = j;//cand
            armazena [j][1] = contaVotos;//votos            

            for (i = 0; i < 10 ; i++)
            {
                if(contaVotos > posicoes[i][1]){
                    auxCand = posicoes [i][0];
                    auxVotos = posicoes [i][1];
                    posicoes [i][0] = armazena [j][0];
                    posicoes [i][1] = armazena [j][1];
                    armazena [j][0] = auxCand; 
                    armazena [j][1] = auxVotos;                    
                }

            }           
            contaVotos = 0;                              
        }

        for (i = 0; i < 10 ; i++)
        {
            System.out.println("O candidato número " + posicoes[i][0] + " obteve " + posicoes[i][1] + " votos\n"
         + "ficando em " + (i + 1) + "º lugar na classificação geral");
            System.out.println("================================================================================");
        }       
    }
}
