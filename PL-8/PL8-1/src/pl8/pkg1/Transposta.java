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
public class Transposta {
/**
 * funcao de mostrar a  matrir trosposta  
 * no lugar das linhas coloquei as colunas na matriz 
 * @param m matrix 
 */
    static void Transposta(int[][] m) {
        System.out.println("  Matrix Tansposta ");
        for (int i = 0; i < m[0].length; i++) {
            System.out.printf("\n");
            for (int j = 0; j < m.length; j++) {
                System.out.printf(" %d ", m[j][i]);
            }
        }

    }
}
