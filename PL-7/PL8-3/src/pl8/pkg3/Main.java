/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8.pkg3;

import java.util.Scanner;

/**
 *
 * @author arccenio
 */
public class PL83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner l=new Scanner (System.in);
        System.out.println("Emter the number of Row");
        int row=l.nextInt();
         System.out.println("Emter the number of Colun");
        int colun=l.nextInt();
        int [][]materix=new int[row][colun];
         EmterTheElements(materix);
    }
    static void EmterTheElements(int[][] m){
                        Scanner l=new Scanner (System.in);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Emter the elements of the matrix");
                 m[i][j]=l.nextInt();
            }
                
            }
            
        }
        
    
    
}
