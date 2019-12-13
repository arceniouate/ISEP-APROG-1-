
package pl5.pkg4;
/*perguntar ao porfessor oque equa quer dizer com n primeiros numeros ferfeitos ????????????????????????????????
*/
import java.util.Scanner;

/**
 *
 * @author Arcenio Salvado Uate
 */
public class PL54 {

    public static void main(String[] args) {   
        Scanner ler=new Scanner(System.in);
        int N;
       // int num;
        //int contador=0;
        int soma=0;
        System.out.println("INSIRA A QUANTIDADE DOS NUMEROS ");
        N=ler.nextInt();
        while(0>=N){
            System.out.println("NUMERO INVALIDO! INSIRA DE NOVO O NUMERO");
            N=ler.nextInt();
        }
       // do{
          /*  System.out.println("Enter the number");
            num=ler.nextInt();
            contador++;*/
             for (int i=1;i<N;i++){
            if (N % i==0){
              soma=soma+i;  
            }
            System.out.println(soma);
        }
             System.out.println();
        if(soma==N){
            System.out.println("numero e perfeito");
        }else {
            System.out.println("numero não e perfeito");
        }
            
    //    }while(N>contador);
        
    }
    
    }
    

