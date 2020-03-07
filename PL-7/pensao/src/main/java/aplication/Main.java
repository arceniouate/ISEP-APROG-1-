/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import entites.Aflatment;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author arccenio
 */
public class Main {

    public static void main(String[] args) {
        int quartos = 10;
        Scanner l = new Scanner(System.in);

        Aflatment[] flat = new Aflatment[quartos];
        System.out.println(" How many room will be rented?");
        int n = l.nextInt();
        while (n > quartos) {
            System.out.println("the number of stundnst can´t be more than the numbr of room");
            System.out.println(" How many room will be rented?");

            n = l.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Name");
            String name = l.next();
            System.out.println("Email");
            String email = l.next();
            System.out.println("Room");
            int nF = l.nextInt();
            flat[nF] = new Aflatment(name, email);

        }
        for (int i = 0; i < flat.length; i++) {
            if (flat[i] != null) {
                System.out.println(i + " : " + flat[i]);
            }

        }
        l.close();
    }

}
