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
        int sumCol = 0;
        float media = 0;
        System.out.println(" ");
        System.out.println("Media de cada coluna ");

        for (int i = 0; i < m[0].length; i++) {// oque e isso
            for (int j = 0; j < m.length; j++) {

                sumCol = sumCol + m[j][i];

            }
            media = sumCol / m.length;
            System.out.printf(" %.2f ", media, "\n");

        }
    }

}
