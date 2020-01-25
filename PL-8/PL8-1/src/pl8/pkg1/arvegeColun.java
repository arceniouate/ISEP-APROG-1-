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
    public static void meiaColuna(int [][]m){
        int soma=0;
        int  aux=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <m[i].length; j++) {
                aux=m[j][0];
                if (m[i][j] <aux) {
                   aux+= m[i][j];
                }
            }
        }
        System.out.println(aux );
        
    }
    
}
