
import java.util.ArrayList;//precisa usar para array dinâmico desse tipo

public class VetorDinamico {
    public static void main (String[] args){
        
        ArrayList<Integer> num = new ArrayList<>();// como declarar. 
        //lembrando q é só mudar dentro do <> para outros tipos
        
        num.add(2); // usando .add vc insere no arraylist
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("tamanho do array " + num.size());
        System.out.println(num);// mostra todos itens do array
        System.out.println("puxando um específico " + num.get(2));// vai puxar o 3º da lista = 4
        System.out.println("======================================");
        
        // rodando o array e pegando todos seus dados 
        for(int i=0;i < num.size(); i++){ 
            System.out.println(num.get(i));
        }
    }   
}
