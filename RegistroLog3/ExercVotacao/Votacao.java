/*
 ============================ CLASSE VOTAÇÃO ==============================
 */
public class Votacao {
    int numeroSecao;	
    int numeroCandidato;
        
    // Método Construtor	
    Votacao(){	
        this(0,0);	
    }	
    
    // Método Procedimento
    Votacao( int numSecao, int numCandidato)
   {	
        numeroSecao = numSecao;	        
        numeroCandidato = numCandidato;
   }	
}
