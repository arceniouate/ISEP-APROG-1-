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
public class LitarRepitidos {
    /**
     * Mostra os nomes repitidos 
     * percorre o vetor 2 vezer  se hover igualdade significa que o nome esta repitido
     * mostra os nomes repitidos
     * @param v
     * @return 
     */
    static int listarNRepitidos(String[] v) {
        System.out.println("Lista de nomes repetidos ");
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i].equals("arcenio")) {

                    System.out.println(v[i]);
                    System.out.println(v[j]);

                    return 1;
                }
            }

        }
        return -1;

    }
    
}
