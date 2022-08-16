import java.util.Arrays;
import javax.swing.JOptionPane;
//import java.util.arraylist; //pq vou usar array - hj já faz parte do pacote básico, então não precisa chamar


//classe primeiro Nome do arquivo igual ao da classe
public class HelloWorld { 
        // Após método principal:
        // tipo,           nome e parâmetros q recebe
	public static void main (String[] args){
		
                System.out.println("============================OLÁ MUNDO===================================");

                System.out.println("Olá¡ mundo!"); // instruções finalizadas com ";"
                // "entre aspas = string"
                System.out.println("Meu Deus q saco"); // Ln no final, pula linha

               /*
               comentário pode ser assim tbm
               */

                dois();
	}

//=============================================================================================
        public static void dois (){
        String nome = "Carlos";
        int idd, n1 = 0;

        boolean a = true;
        boolean b = false;
        boolean c = true;

                System.out.println("=============================OP LÓGICOS==================================");
		System.out.println(a && b && c);//aqui ele só mostra falso pq tem um falso.
                                                // é o resultado da operação. v e f e v

		System.out.println(a || b || c); // aqui é o ou, q vai dá v

		System.out.println(!(a || b || c));// negando tudo 

                idd = tres(n1);

		System.out.println("nome: " + nome + idd);

                quatro();// estruturas de decisão e repetição
                cinco();// array
	}

//=============================================================================================
// repara q é do tipo inteiro, o método
        public static int tres (int n){
            n = -40; // dá pra colocar o valor negativo já como resultado só colocando o negativo na frente
// se for positivo é só por o mais. 
            int x = 8;
            int z = x;
            int w = x++; // pós incremento (incremento só depois de w receber valor) 
            int y = ++x;//pré incremento (incremento antes de y receber valor) pode colocar tbm --x ou x--

            System.out.println("==============================OPERADORES=================================");
            System.out.println("operadores de incremento " + x + " | " + z + " | " + w + " | " + y);       
            return n;
           
        }


//=============================================================================================
        public static void quatro (){
            
            int j;

            System.out.println("==============================ESTRUTURAS=================================");
            
            j = Integer.parseInt( JOptionPane.showInputDialog ("Digite um número") );
            if (j<10){
                    while (j < 10){
                            System.out.println(j);
                            j++;
                    }
            }
            else if(j > 10 && j < 20){
                    do{
                            System.out.println(j);
                            j++;
                    }while (j < 20);
            }
            else {
                    for (int i=0; i<5; i++){
                            System.out.println(i);                           
                    }
            }


            System.out.println("valor final do número: " + j);       
           
        }



//=============================================================================================
// repara q é do tipo inteiro, o método
        public static void cinco (){
            String[] paises ={"Brasil","USA","Argentina","Inglaterra"};

            System.out.println("==============================ARRAY================================="); 

            System.out.println(paises[0]); 

            System.out.println(Arrays.toString (paises));//mostra valores no array

            int posicao = Arrays.binarySearch(paises, "Brasil");//variável q recebe o número da
            // posição do procurado
            System.out.println(posicao); // aqui printa a posição q nesse caso é zero
            // aqui o array começa em zero

            Arrays.sort(paises, 0, paises.length);// ordena nosso array iniciando do zero
            System.out.println("Array ordenado" + Arrays.toString (paises));// ficou em ordem  alfabética

            String[][] dimensoes ={{"Carlos", "M", "SP"},{"Lidi", "F", "MG"}};
            System.out.println("Duas dimenções no Array 0,0 " + dimensoes[0][0]);
            System.out.println("Duas dimenções no Array 0,1 " + dimensoes[0][1]);
            // onde a primeira linha (0) é do carlos, e da segunda (1) da lidi, e os outros são posições 
            System.out.println("Duas dimenções no Array 0,1 " + dimensoes[1][2]);
                  
        }
}
