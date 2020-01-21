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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int max = 100;
        char opcao;
           String[] v = new String[max];
        //String[] v = {"arcenio", "arcenio", "arcenio", "Vanessa", "artimiza", "matilde ", "calos"};
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    EnterName.EnterTheV(v,max);
                    break;
                case 2:
                    ShowNames.mostrar(v);
                    break;
                case 3:

                    AtualizarV.atualizarNome(v);
                    break;
                case 4:
                    System.out.println("Insira a inicial dos nomes que pretende ver");
                    char start = l.next().charAt(0);

                    MInicial.listaNome(start, v);
                    break;
                case 5:
                    LitarRepitidos.listarNRepitidos(v);
                    break;

            }

        } while (op != 0);

    }

    /**
     *
     * @return
     */
    static int menu() {
        Scanner l = new Scanner(System.in);
        String texto = "\nMenu:"
                + "\n Inserir um visitante 1 "
                + "\n Listar todos os visitantes 2 "
                + "\n Atualizar um dado nome 3"
                + "\n Listar nome que comeca com uma dada letra 4"
                + "\n Listar nomes repitidos 5 "
                + "\n Sair  0 "
                + "\n Qual e a sua opcao";
        System.out.printf("%n%s%n", texto);
        int op = l.nextInt();
        l.nextLine();
        return op;
    }

    
}
