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
        int[] v = new int[nEle];
        int []vc=redyNumber(v);
        for(int i=0;i<vc.length;i++){
            System.out.println(vc[i]);
            
        }
        inversaoDaOrdemEle(v);
               int[]p= inverterDireita(v,nEle);
               for (int i = 0; i < p.length; i++) {
                   System.out.println(p[i]);
        }

    }

    /**
     * ***
     * metodo para ler os elemetos e inseri o vetor definido na classe peincipal
     *
     * @param v vetor para inseri os numeros inteiros
     */
    public static int [] redyNumber(int[] v) {
        Scanner l = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Enter the number ");
            v[i] = l.nextInt();
        }
        return v;
    }

  
    
    public static void  inversaoDaOrdemEle(int []v){
        int left=0;
        int rigth=v.length-1;
        while(left<rigth){
            int temp=v[left];
            v[left]=v[rigth];
            v[rigth]=temp;
            //mover para direita ou para esquerda o valor apontado
            left++;
            rigth--;
            mostrar(v);
        }
        
    }
      public static void  mostrar(int []v){
          
        for (int i = 0; i <v.length; i++) {
            System.out.printf("%d ",v[i]);
            
        }
    }
   public static int [] inverterDireita(int []v,int n){
       int []r=new int [n];
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
                   

           r[1]= v[0];
            r[2]=v[1];
           r[0]= v[2];
        
       }

       }
                      return r;

   }
}
