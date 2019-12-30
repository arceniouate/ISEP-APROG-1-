/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7.pkg2;

import java.util.Scanner;

/**
 *
 * @author arccenio
 */
public class PL72 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        int nF;// numero de funcionarios
        int nFMAx = 20;// n
        System.out.println("Enter the number of Employer ");
        nF = l.nextInt();
        while (nF > nFMAx) {
            System.out.println("invalid number ");
            System.out.println("The number of Employer must be smaller than 20");
            System.out.println("Enter again");
            System.out.println("Enter the number of Employer ");
            nF = l.nextInt();

        }
        double[] salarys = new double[nF];// the arry of salarys
        String[] names = new String[nF];
        redyNameMoney(names, salarys, nF);
        double perc= percentage(salarys  ,nF);
               System.out.printf("%.2f%%",perc); 
    }

    /**
     * Esse metodo vai ler o numero de funcinarios, nome dos funcionarios e os
     * repectivos vecimentos
     */
    public static void redyNameMoney(String[] nomes, double[] salarios, int nF) {
        Scanner l = new Scanner(System.in);
        String nome;//name of Employer
        int c = 0;
        double soma = 0;

        do {
            System.out.println("Enter the  name of Employer  ");
            nome = l.next();
            if (!nome.equals("tt")) {
                System.out.println("Enter the Salary of Employer ");
                salarios[c] = l.nextDouble();
                soma += salarios[c];
                nomes[c] = nome;
                c++;   

            }

        } while (!nome.equals("tt") && (nF < 20));
        double media = soma / c;
        listar(nomes, salarios, media, c);

    }

    public static void listar(String[] n, double[] s, double media, int c) {
                System.out.println("Average salary="+media);

        for (int i = 0; i < c; i++) {
            if (media >s[i]) {
                System.out.println( n[i]+" Receve the salary smaller than arvege");

            }

        }
  
    }
    /**
     * esse metodo vai compara todos o valor inserido pelo utilizador se o valor for mair que o salrio vai apresentar a percentagem
     * @param salary vetor com todos so salarios 
     * @param nF numero total de funcionarios 
     */
    public static double percentage(double[]salary ,int nF){
        Scanner l=new Scanner (System.in);
        int soma=0;
        double p=0;
        System.out.println("Enter the number ");
       double valor =l.nextDouble();
        for (int i = 0; i < nF; i++) {
           if(valor>salary[i]){
               soma+=salary[i];
           }
           p=soma/100;
           
             
        }
    return p;
}

}
