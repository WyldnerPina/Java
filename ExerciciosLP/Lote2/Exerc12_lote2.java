

public class Exerc12_lote2 {
    public static void main (String[] args){

        int n[][] = new int[8][8];   
        int soma = 0;

        for(int L=0; L<8; L++){
            for(int C=0; C<8; C++){
                switch (L)
                {
                      case 0:
                      case 7: n[L][C] = FuncaoLinha1(C);
                                   break;
                      case 1:
                      case 6: n[L][C] = 1;
                                   break;
                      case 2:
                      case 5: n[L][C] = 7;
                                   break;
                      case 3:
                      case 4: n[L][C] = 7;
                                   break;
                      default: n[L][C] = 0;
                }
            }
        }

         for(int L=0; L<8; L++){
            for(int C=0; C<8; C++){
                System.out.print(n[L][C] + " = ");
                soma = soma + (n[L][C]);
                System.out.print(soma + " || ");
            }
             System.out.println();
         }          
        System.out.println("Somando = " + soma);
    }



    static int FuncaoLinha1(int num) {
        switch (num)
        {
              case 0:
              case 7:  num = 2;//torre
                       break;
              case 1:
              case 6:  num = 4;//cavalo
                        break;
              case 2:
              case 5:  num = 3;//bispo
                        break;
              case 3:  num = 5;//rainha
                        break;
              case 4:  num = 6;//rei
                        break;
              default: num = 0;
        }
        return num;
    }  
}