package pl8.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arccenio
 */
public class ShowMatrix {
    /**
     * This class gonna show the complite matrix 
     * @param m  a mattrix with number 
     */
    public static void showMAtrix(int [][]m){
   
        System.out.println("MATRIX COMPLETA");
        for (int i = 0; i < m.length; i++) {
            System.out.printf("\n");
                for (int j = 0; j <m[i].length; j++) {
                    System.out.printf(" %d ",m[i][j]);
                
            }
            }
        
    }
    
}
