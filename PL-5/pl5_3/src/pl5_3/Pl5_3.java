  
package pl5_3;
import javax.swing.JOptionPane;
/**
 *
 * @author Arcenio Uate
 * */
public class Pl5_3 {
    public static void main(String[] args) {
    String aux,nome ;
    int totalpessoa=0;
    int contIdade=0;
    double pecIdaMaior;
    int idade;
     do{
         nome=JOptionPane.showInputDialog("INSIRA O NOME ");
           if(!"zzz".equalsIgnoreCase(nome)){
               totalpessoa++;
           }
           /*
           TO  fazer comque  quando se insere o zzz no programa o programa pare de fazer pedidos 
           TO Fazer comque o programa   Mostre uma lista de de alunos ao envez de  do utilizador inserir o nome ele mostrar 
           mostrar um a lista de todos os nome
           */
           aux=JOptionPane.showInputDialog("Insira a idade");
           idade=Integer.parseInt(aux);
           if(idade>=18){
               contIdade++;
           }
            JOptionPane.showMessageDialog(null,totalpessoa);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
         
     }while(!"zzz".equals(nome));
     
   //JOptionPane.showMessageDialog(null, totalpessoa);
    pecIdaMaior=contIdade/totalpessoa;
    JOptionPane.showMessageDialog(null,"percentagem de :"+ pecIdaMaior);
}
     
     
    }

