// Calcule a quantidade de litros gastos em uma viagem, sabendo que o 
// automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média

import javax.swing.JOptionPane;
public class ExerLP01_17 {

// levando em consideração q não haverá mudanças de grandezas, então tempo = hora e velocidade média = km/h. 
// ambos com valores inteiros
    public static void main (String args [ ])
     {
       int temp, vm, litros;
       temp  = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de viagem (em horas): "));        
       vm  = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média (km/h): "));        
       litros = (temp * vm)/12;
       JOptionPane.showMessageDialog(null,"O consumo de combustível é de: " + litros);
     }
}