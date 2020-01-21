/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complimentarpl7.pkg1;

import java.util.Scanner;

/**
 *
 * @author arcenio
 */
public class LeituraN {
/**
 *  ler numeros com n Elementos definidos pelo utilizador 
 * @param n numero de numeros que seram esiridos
 * @param v  vetor para guardar numeros
 */
    public static void lernumero(int n,int []v) {
        Scanner l = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.println("INSIRA O NUMERO");
            v[i]=l.nextInt();

        }

    }

}
