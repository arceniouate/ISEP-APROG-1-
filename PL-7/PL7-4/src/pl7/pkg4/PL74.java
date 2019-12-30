/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7.pkg4;

import java.util.Scanner;

/**
 *
 * @author arccenio
 */
public class PL74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nEle;
        Scanner l = new Scanner(System.in);
        System.out.println("Enter the number of element of the array");
        nEle = l.nextInt();
        int []v=new int [nEle];
        redyNumber(v);
    }
    /*****
     * metodo para ler  os elemetos e inseri o vetor definido na classe peincipal
     * @param v vetor para inseri os numeros inteiros 
     */
    public static void redyNumber(int[] v) {
        Scanner l = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Enter the number ");
            v[i] = l.nextInt();
        }
    }
}
