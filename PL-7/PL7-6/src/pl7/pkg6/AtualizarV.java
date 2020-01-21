/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7.pkg6;

import java.util.Scanner;

/**
 * 
 * @author arccenio
 */
public class AtualizarV {
    /**
     * metodo para perquisar um nome no vetor 
     * @param nome que pretende pesquisar
     * @param v vetor com os nomes 
     * @return  
     */
    static int pesquisaE(String nome, String[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(nome)) {
                return i;
            }
        }
        return -1;

    }
/***
 * metodo para atualizar um nome no vetor
 * @param v  vetor com os nomes 
 */
    public static void atualizarNome(String[] v) {
        Scanner l = new Scanner(System.in);
        String nome;
        System.out.println("Insira o nome que pretende atualizar?");
        nome = l.next();
        int pos = pesquisaE(nome, v);
        // for (int i = 0; i < 10; i++) {
        v[pos] = "";
        v[pos] = l.next();

        
    }
    
}
