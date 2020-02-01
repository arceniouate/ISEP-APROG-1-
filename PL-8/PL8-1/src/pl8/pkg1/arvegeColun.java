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
       double arverege = 0;
        int sumColun = 0;
        System.out.println("");
        for (int j = 0; j < m.length; j++) {
            for (int i = 0; i < m.length; i++) {
               
                sumColun=m[i ][j];
                System.out.println("   "+sumColun);

            }

           System.out.printf("soma %d \n ",sumColun);
                arverege=sumColun/m[j].length;
               System.out.printf("media",arverege);
             sumColun = 0;
             arverege = 0;
        }

      //  return arverege;
    }
    static void mediaGlobal(int [][]m){
                double mediaGlobal=0;
                int somaTotal=0;
                for (int i = 0; i < m.length; i++) {
                    for (int j = 0; j < m.length; j++) {
                        somaTotal+=m[i][j];
                        
                        
                        
                    }
        }
                mediaGlobal=mediaGlobal/m.length;
                

        
    }

}
