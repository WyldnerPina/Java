import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String[] args) {
        int i, giros = 5;
        
        // instanciando classe abstrata aluno
        Aluno[] aluno = new Aluno[giros];
        
        // instanciando método
        Metodos metodos = new Metodos();
                
        for (i = 0 ; i < giros ; i++){
            aluno[i] = new Aluno();            
        }
        
        //============================================== MENU =================================================
        int opc = 0 ;
        while (opc!=9){
        opc = Integer.parseInt(JOptionPane.showInputDialog(""
                + "1 - Grava aluno \n "
                + "2 - Ler aluno \n "
                + "3 - Finaliza"));
            switch (opc) {
                case 1: metodos.Gravar(aluno, giros);// CHAMADA FUNÇÃO
                        break;
                case 2: metodos.Ler(aluno, giros);// CHAMADA PROCEDIMENTO
                        break;                
                case 3: JOptionPane.showMessageDialog(null,"Programa finalizado");
                        break;
                case 4: metodos.Teste(aluno, giros);// CHAMADA PROCEDIMENTO
                        break;   
                default:JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
    
    
        
        
        
    }
}
