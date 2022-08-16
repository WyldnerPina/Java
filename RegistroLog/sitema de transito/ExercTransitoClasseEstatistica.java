
public class ExercTransitoClasseEstatistica {
    int codcity;	
    String namecity;	
    int crashes;
    int car;
    
    // Método Construtor	
    ExercTransitoClasseEstatistica(){	
        this(0,"",0,0);	
    }	
    
    // Método Procedimento
    ExercTransitoClasseEstatistica( int codcidade, String nomecidade, int colisoes, int tipoveiculo)
   {	
        codcity = codcidade;	
        namecity = nomecidade;	
        crashes = colisoes;
        car = tipoveiculo;
   }	    
}
