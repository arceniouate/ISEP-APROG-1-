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
public class MInicial {
    /***
     * pregrama mostra os nomes a travez da inserção de uma letra inicial
     * @param m inicial do nome 
     * @param v  vetor com todos nome 
     */
      static void listaNome(char m, String[] v) {
          System.out.println("==LIST OF NAMES");
        for (int i = 0; i < v.length; i++) {
            char startingLetterOfName = v[i].charAt(0);
            if (startingLetterOfName == m) {
                System.out.println(v[i]);
            }

        }
         
    }
    
}
