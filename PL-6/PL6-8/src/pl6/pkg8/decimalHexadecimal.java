/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6.pkg8;

/**
 *
 * @author arccenio
 */
public class decimalHexadecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1156;
       
       String n= Hexadeciaml( num);
        System.out.println(n);
    }

    public static String  Hexadeciaml(int decimal) {
        int r = 0;
        String hex = "";
        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while(decimal>0){
          r = decimal % 16;
          hex=hexchars[r]+hex;
          decimal=decimal/16;

        }
        return hex;

    }
}
