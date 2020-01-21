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
public class EnterName {
     /**
     *
     * esse metodo tema afuncaor de inserir visitantes no vetor
     *
     * @param v vetor onde iremos inserir visitantes
     */        // optei por não declarar a classe Scanner como global por motivos de seguranca
    static void EnterTheV(String[] v, int nEle) {
        String nome;
        int p = 0;
        Scanner l = new Scanner(System.in);

        do {
            System.out.println("Enter the name ");
            System.out.println(" for stop enter a ");
            nome = l.next();

            v[p] = nome;
             
            p++;
        } while (nEle >= 100 && !nome.equals("a"));
    }
    
}
