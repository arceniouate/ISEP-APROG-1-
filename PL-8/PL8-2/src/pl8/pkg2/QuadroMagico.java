/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8.pkg2;

/**
 *
 * @author arccenio
 */
public class QuadroMagico {
    static int  sumRow(int [][]m){
        int sumRow=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                   sumRow+=m[i][j];           
            }
        }
         return sumRow;
    }
    static int  sumColun(int [][]m){
        int sumC=0;
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                sumC+=m[j][i];
                
            }
            //System.out.println(sumC);
        }
        return sumC;
    }
    static void quadroMAgico(int [][]m){
            int sumC=0;
    for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                sumC+=m[j][i];
                
            }
           System.out.println(sumC);
        }
               System.out.println(sumC);

}
}

