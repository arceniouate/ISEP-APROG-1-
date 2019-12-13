
package pl5.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Arcenio Salvado Uate
 */
public class Pl51 {

    public static void main(String[] args) {
      int cont=0;//declaracao da variavel e inicializacao com zerrp
      int soma=0;
      int numero;
      int capacidade;
     double media ;
     String aux;
     aux=JOptionPane.showInputDialog("Insira a capacidade");//mostrar a mesagem ao utilizador com asinstruÃ§Ãµes 
       capacidade = Integer.parseInt(aux);//leitura da capacidade e converÃ§Ã£o aux em  inteiro
       for(int i=0; i<capacidade;i++){
           aux=JOptionPane.showInputDialog("Insira o numero "); 
           numero = Integer.parseInt(aux);
           if(numero%2==0){//verificar se o numero e par ou nÃ£o
              soma=soma+numero;//fazer a soma do numero
              cont++;//contador 
           }
           
       }
       if(cont!=0){//se numero for diferente de zerro vai calcular a media 
           media=soma/cont;//calculo da  media 
           JOptionPane.showMessageDialog(null,"meia"+media);//mostrar  a media calculada a
       }
    }
    
    
}
