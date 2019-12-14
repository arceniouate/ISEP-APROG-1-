/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6.pkg7;

import java.util.Scanner;

/**
 *
 * @author arccenio
 */
public class PL67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
;
        String s;

        do {

            System.out.println("INSIRA O TIP DE SOLIDO!"
                    + "PARA TERMINAR INSIRA FIM ");
            s = l.next();
            if (s.equals("Esfera")) {
                System.out.println("INSIRA A DIMENSAO");
                int r = l.nextInt();
                double rest = vesfera(r);
                System.out.println("Volume da esfera =" + rest);

            } else if (s.equals("Cilindro")) {
                System.out.println("insira o valor do R");
                int r = l.nextInt();
                System.out.println("insira o valor da Altura ");
                double a = l.nextDouble();
                double rest = Vcilindro(r, a);
                System.out.println("Volume do cilindro =" + rest);

            }else if(s.equals("Clone")){
                System.out.println("Insira o Raio");
                Double r=l.nextDouble();
                System.out.println("Insira a altura ");
                double al=l.nextDouble ();
                 Double re=Vclone( r,al);
                 System.out.println("Volume do Clone ="+re);
                      
                 
            }

        } while (!s.equals("FIM"));

    }

//
    static double vesfera(int R) {
        if (R == 0) {
            return -1;
        }

        return 4 / 3 * 3.14 * Math.pow(R, 3);
    }

    static double Vcilindro(int R, double altura) {
        return 3.14 * Math.pow(R, 2) * altura;
    }
    static  double  Vclone(double r ,double al){
        return 1 / 3 * 3.14 * (Math.pow(r,2)) * al;
    }
}
