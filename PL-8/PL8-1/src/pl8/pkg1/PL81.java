/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8.pkg1;


/**
 * verifica mair valor de cada uma das linhas
 *
 * @author arccenio
 */
public class PL81 {

    public static void main(String[] args) {
        int x;
        int m[][] = {{1, 4, 2, 1}, {9, 7, 2, 2}, {1, 7, 3, 5}, {2, 5, 0, 3}, {4, 7, 2, 1}};
       ShowMatrix.showMAtrix(m);
       arvegeColun.meiaColuna(m);
        for (int i = 0; i < m.length; i++) {
          //  x = m[i][0];
            for (int j = 1; j < m[i].length; j++) {
               // System.out.println(m[i][j]);
               // if (m[i][j] > x) {
                   // x = m[i][j];
                }
            }
          ///  System.out.println(x);
        }
    }
    

