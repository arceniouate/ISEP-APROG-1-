
package pl5.pkg7;

import java.util.Scanner;

/**
 *
 * @author Arcenio Salvado Uate
 */
public class PL57 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, aux, num, c, d, e;
        System.out.println("Enter the number of A");
        a = ler.nextInt();
        System.out.println("Enter the number of B");
        b = ler.nextInt();
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        e = 0;
        System.out.println("Enter the number of D");
        d = ler.nextInt();
        for (c = 1; c < d; c++) {
            System.out.println("Enter the number");
            num = ler.nextInt();
            if((b % num==0)  && (num % a==0)){
                e=e+1;
            }
        }
        System.out.println("ToDo fucionalidade "+e);
    }

   
    
}
