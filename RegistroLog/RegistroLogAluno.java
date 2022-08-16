// ****  CLASSE ABSTRATA *****************

// Classe Abstrata
class RegistroLogAluno 	
{	
  String pnome;	
  String unome;	
  int pontos;	
	
  // Método Construtor	
  RegistroLogAluno()
   {	
     this("" ,"" , 0);	
   }	

  // Método Procedimento
  RegistroLogAluno ( String pnomealuno,	
          String unomealuno,	
          int pontosaluno )	
   {	
     pnome   = pnomealuno;	
     unome  = unomealuno;	
     pontos  = pontosaluno;	
   }	
 }	
