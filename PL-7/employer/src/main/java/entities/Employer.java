/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author arccenio
 */
public class Employer {
    private int id;
    private String name;
    private double salary;

    public Employer() {
    }
/***
 * contrutor comparamentros
 * @param id
 * @param name
 * @param salary 
 */
    public Employer(int id,String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id=id;
    }
    public int  getId() {
        return id;
    }
    public String   getName() {
        return name;
    }
    

   

    public void setId(int  id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    
     public void  setSalary(double salary) {
         this.salary=salary;
        
                }
    public void addSalary(double p){
        
       salary += salary * p / 100;
        
    }
    
   
    @Override
    public String toString (){
    return 
            id
            +" : "
            +name 
            +" "
            +String.format("%.2f",salary);
}
    
    
}
