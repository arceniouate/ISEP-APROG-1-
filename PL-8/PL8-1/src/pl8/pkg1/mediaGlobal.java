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
public class mediaGlobal {
    /**
     * Tem a funcao de calcular e mostrar a media global da matris 
     * 1º irei fazer a soma total de 2º dividir a somaTotal  pelo tamnho da matriz 
     * @param m  matriz com info
     */
    static void mediaGlobal(int[][] m) {
        double mediaGlobal = 0;
        int somaTotal = 0;
        System.out.println("  ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                somaTotal = somaTotal + m[i][j];

            }

        }
        mediaGlobal = somaTotal / m.length;

        System.out.println("Media Global " + mediaGlobal);

    }
    
}
