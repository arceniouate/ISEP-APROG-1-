/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5.pkg6;
import java.util.Scanner;
/**
 *
 * @author Arcenio Salvado Uate
 */
public class PL56 {

    
    public static void main(String[] args) {
        int num,num1;
        int contadorP=0;
             int contadorP1=0;
        Scanner ler =new Scanner(System.in);
        do{
            System.out.println("The first sequence");
            System.out.println("Enter the number");
            num=ler.nextInt();
            if(num%2==0){
                contadorP++;
            }
        }while(num!=0);
         do{
             System.out.println("The secound sequence ");
            System.out.println("Enter the number");
            num1=ler.nextInt();
             if(num%2==0){
                contadorP1++;
            }
        }while(num1!=-1);
         if( contadorP>contadorP1){
          System.out.println("The sequence tha have more pair is The 1º Sequence "+contadorP);   
         }else{
             System.out.println("The sequence tha have more pair is The 2º Sequence \n with the "+contadorP1+ " number ");
         }
            
    }
    
}
