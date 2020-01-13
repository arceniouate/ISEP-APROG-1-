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
public class PL76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int max = 100;
        char opcao;
        String[] v = new String[max];
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    EnterTheV(v, max);
                    break;
                case 2:
                    mostrar(v);
                    break;

            }

        } while (op != 0);

    }

    static int menu() {
        Scanner l = new Scanner(System.in);
        String texto = "\nMenu:"
                + "\n Inserir um visitante 1 "
                + "\n Listar todos os visitantes 2 "
                + "\n Atualizar um dado nome"
                + "\n Listar nome que comeca com uma dada letra 3 "
                + "\n Listar nomes repitidos 4 "
                + "\n Sair  0 "
                + "\n Qual e a sua opcao";
        System.out.printf("%n%s%n", texto);
        int op = l.nextInt();
        l.nextLine();
        return op;
    }

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

    static void mostrar(String[] v) {
        System.out.println("======LISTA DE NOMES DE VISITANTES======");
        for (int i = 0; i < v.length; i++) {
            if(v[i]!=null){
            System.out.println(v[i]);
            }
        }
    }
}
