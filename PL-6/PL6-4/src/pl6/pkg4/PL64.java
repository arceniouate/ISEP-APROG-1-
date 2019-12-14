/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6.pkg4;

import java.util.Scanner;

/**
 *
 * @author arccenio
 */
public class PL64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Combinatorio s = new Combinatorio();
        int rest = s.fatorial(5);
        int a = s.Arranjo(6, 4);
        int p=s.perm(6);
        System.out.println(""+p);

    }

}
