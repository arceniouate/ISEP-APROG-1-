/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import entities.BankAccont;
import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author arccenio
 */
public class Main {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Enter account number :");
        long account = l.nextLong();
        System.out.println("Enter account holder :");
        String name = l.next();
        System.out.println("Is there initial deposit(Y/N)");
        String s = l.next();
        if (s.equals("Y")) {
            System.out.println("Enter the initial deposit");
            double d = l.nextDouble();
            BankAccont bank = new BankAccont(account, name, d);
            System.out.println("Accout date");
            System.out.println(bank);
            System.out.println("");
            System.out.println("Enter a deposit value : ");
            double dd=l.nextDouble();
            bank.desposit(dd);
            System.out.println("update  account date");
            System.out.println(bank);
            System.out.println("");
            System.out.println("Enter a withdraw value :");
            double o=l.nextDouble();
            bank.withdraw(o);
            System.out.println("update  account date");
            System.out.println(bank);
            
        } else if(s.equals("N")) {
            BankAccont bank = new BankAccont(account, name);
            System.out.println("Accout date");
            System.out.println(bank);

        }

    }

}
