// Receba a hora de início e de final de um jogo (HH,MM) sabendo que o 
// tempo máximo é de 24 horas e pode começar num dia e terminar noutro

import javax.swing.*;

public class ExercLP02_25 {
public static void main (String args [ ]) {
    
    int hi, hf, mi, mf, hora, min;
    
    hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
    mi = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos do início"));
    hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do fim da partida"));
    mf = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos finais da partida"));
   
// aqui resolvi tratar os possíveis erros só a nível didático. o fato de não arrumar as casas decimais 
//(por ainda não saber), pode gerar um erro na apresentação 30min pode ser confundido 03, porém 
// no primeiro aparece 30 e no segundo só 3.
   if (((hf > 23) || (hi > 23) || (mi > 59) || (mf > 59)) || ((hf < 0) || (hi < 0) || (mi < 0) || (mf < 0)) || (hf == hi) && (mf <= mi))
    {
        JOptionPane.showMessageDialog(null,"Dados de entrada incorretos");
    }
    else
    {
       if (hi > hf)
          {         
                      if (mi > mf)
                      {                        
                          hora = ((hf + 24) - hi) -1;                      
                          min = (mf + 60) - mi;
                          JOptionPane.showMessageDialog(null,"O tempo de partida foi de: " + hora + "h" + min + "min");
                      }
                      else
                      {                      
                          hora = (hf + 24) - hi;
                          min = mf - mi;
                          JOptionPane.showMessageDialog(null,"O tempo de partida foi de: " + hora + "h" + min + "min");
                      }
          }
       else
          {
                      if (mi > mf)
                      {         
                           hora = (hf - hi) - 1;                       
                           min = (mf + 60) - mi;
                           JOptionPane.showMessageDialog(null,"O tempo de partida foi de: " + hora + ":" + min);
                      }
                      else
                      {
                           hora = hf - hi;                       
                           min = mf - mi;
                           JOptionPane.showMessageDialog(null,"O tempo de partida foi de: " + hora + ":" + min);                      
                      }
          }
    }
 } 
} 