
import java.io.IOException;



public class Metodos {
//====================================================================================================
//============================================== GRAVAR ==============================================
//====================================================================================================    
    public void Gravar(Aluno[] cadastrar,int giros) throws IOException{        
        // instanciando GravaAluno 
        GravaAluno gravando = new GravaAluno();
        
        gravando.grava(cadastrar, giros);
                
    }
    

//====================================================================================================
//============================================== LER =================================================
//====================================================================================================        
     public void Ler(Aluno[] lendo, int giros){
        // instanciando LerAluno 
        LerAluno leitura = new LerAluno();
        
        //leitura.LendoArqv();
        
     }
     
     
     public void Teste(Aluno[] lendo, int giros){
         int a = 0;
         
         System.out.println(a);
     }
}
