/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7.pkg6;

/**
 *
 * @author arccenio
 */
public class ShowNames {
      /**
     * 
     * mostrar o nome de todos visitantes 
     * @param v
     */
    static void mostrar(String[] v) {
        System.out.println("======LISTA DE NOMES DE VISITANTES======");
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null && !v[i].equals("a")) {
                System.out.println(v[i]);
            }
        }
    }
    
}
