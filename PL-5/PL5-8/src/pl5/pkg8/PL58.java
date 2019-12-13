package pl5.pkg8;

import java.util.Scanner;

/**
 *
 * @author Arcenio Salvado Uate
 */
public class PL58 {
public static void main(String[] args) {
       Scanner ler =new Scanner(System.in);
       int num;
       boolean binario=true;
       System.out.println("Insira o numero");
       num=ler.nextInt();
      while(num!=0 && binario == true){
          if(num%10>1){
              binario=false;
          }else{
              binario=true;
          }
          num=num/10;
    }
      if(binario){
          System.out.println("o numero e binario ");
      }else{
          System.out.println("numero não e binario");
      }
    }
    
}

    
