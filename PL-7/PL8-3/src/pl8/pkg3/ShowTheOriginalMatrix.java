/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8.pkg3;

/**
 *
 * @author arccenio
 */
public class ShowTheOriginalMatrix {
    static void showTheMAtrix(int [][]m){
        System.out.println("Original Matrix");
        for (int i = 0; i < m.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < m.length; j++) {
                System.out.printf(" %d ",m [i][j]);
            }
            
        }
    }
    
}
