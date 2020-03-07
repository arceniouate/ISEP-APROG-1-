package aplication;

import entities.Employer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arccenio
 */
public class Main {

    public static void main(String[] args) {
        List<Employer>list=new ArrayList<>();
        Scanner l = new Scanner(System.in);
        System.out.println("How many employer you will be registered");
        int n = l.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("ID");
            int id=l.nextInt();
            System.out.println("Name");
            String name =l.next();
            System.out.println("Salary");
            double salario=l.nextDouble();
            list.add(new Employer(id,name,salario));
        }
        System.out.println("Enter the I that you will increment the salary");
        int id=l.nextInt();
        // verificar se o id existe
         Employer emp=list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
    if(emp==null){
        System.out.println("this id does not existe");
    }else{
        System.out.println("Enter the pertentege");
        double p=l.nextDouble();
        emp.addSalary(p);
    }
        for (Employer employer : list) {
            System.out.println(employer);
        }
        l.close();
            
        }
    


}
