/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8.pkg1;

/**
 *
 * @author arccenio
 */
public class arvegeColun {

    /**
     * This metodo gonna calculate the arverge of the j on the metrix
     *
     * @param m
     */
    public static void meiaColuna(int[][] m) {
        for(int i = 0; i < m.length; i++){    
            int  sumCol = 0;    
            for(int j = 0; j < m.length; j++){    
              sumCol = sumCol + m[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
    

    //  return arverege;
    static void mediaGlobal(int[][] m) {
        double mediaGlobal = 0;
        int somaTotal = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                somaTotal = somaTotal + m[j][i];

            }

        }
        mediaGlobal = somaTotal / m.length;

        // System.out.println("soma " + somaTotal);
        System.out.println("  ");
        System.out.println("Media Global " + mediaGlobal);

    }

}
