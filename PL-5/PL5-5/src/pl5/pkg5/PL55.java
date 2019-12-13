/*
 *Funcionalidade ordenar os numros impares em ordem 
 */
package pl5.pkg5;

import java.util.Scanner;

/**
 *
 * @author Arcenio Salvado Uate
 */
public class PL55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler =new Scanner (System.in);
      int res=0;
      int aux=1;
      int num;
      System.out.println("Enter the number");
      num=ler.nextInt();
      while(num!=0){
         int  d=num % 10;
         if(d % 2==1){
             res=res+d*aux;
             System.out.println(res);
             aux=aux*10;
             
         }
          num=num/10;
         
      }
     // System.out.println("odd number reversed "+res);
    }
    
}
