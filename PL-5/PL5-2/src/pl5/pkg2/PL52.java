/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Arcenio Salvado Uate
 */
public class PL52 {

    
    public static void main(String[] args) {
        int Temp;//declaração da variavel
        int Ndias;
        String aux;
        aux = JOptionPane.showInputDialog("Insira o numero de dias ");
        Ndias = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Insira a temperatura  ");
        Temp = Integer.parseInt(aux);
        if (-30 <= Temp && Temp < 9) {// & essa sinal usamos como o e do peceudocodigo
            JOptionPane.showMessageDialog(null, "MUITO FRIO");
        } else if (9 <= Temp && Temp < 15) {
            JOptionPane.showMessageDialog(null, "Frio");
        } else if (15<= Temp && Temp<20) {
            JOptionPane.showMessageDialog(null,"AMENO");
        }else if(20<= Temp && Temp<30){
            JOptionPane.showMessageDialog(null,"QUENTE");
        }else if(30<=Temp && Temp<50){
            JOptionPane.showMessageDialog(null,"MUITO QUENTE");
        }else{
            JOptionPane.showMessageDialog(null, "TEMPERATURA EXTREMA");
        }
    }

}

    

