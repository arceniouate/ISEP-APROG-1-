/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_2;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author arccenio
 */
public class Pl6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nAlunos, nDiscp, nAprov = 0;// numero de alunos 
        String disc = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("INSIRA O NUMERO  DE ALUNOS ");
        nAlunos = sc.nextInt();
        System.out.println("INSIRA O NUMERO DE DISCIPLINAS");
        nDiscp = sc.nextInt();
        
        while (nAlunos < nDiscp) {
            System.out.println("INSIRA O NUMERO DE DISCIPLINAS");
            nDiscp = sc.nextInt();

        }
        
           
        
       for (int i = 0; i < nDiscp; i++) {
            System.out.println("INSIRA A DISCIPLINA ");
            disc = sc.next();
            System.out.println("INSIRA O NUMERO DE APROVADOS");
            nAprov = sc.nextInt();
            while(nAprov>nDiscp){
            
         System.out.println("INSIRA O NUMERO DE APROVADOS");
                nAprov=sc.nextInt();
    }
       }
            
             String m= imprimir(nAlunos, disc, nAprov);
        System.out.println(m);

     
       
       
   }

    public static String  imprimir(int nAlunos, String disc, int nAprova) {
        String positivo = "";
        String negativo = "";
        String info=null;
      
        for (int i = 0; i <nAprova; i++) {
            positivo = positivo + "*";
        }
        for (int i = 0; i < (nAlunos - nAprova); i++) {
            negativo = negativo + "*";
        }
        
       info="\nDisciplinas\n"+disc+"\nPositivo\n"+positivo+"\nNegativa\n"+negativo;
       return info;
    }
}
