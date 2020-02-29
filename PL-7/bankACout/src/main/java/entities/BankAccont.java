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
public class BankAccont {
    private static final int taxa=5;
     private long account;
     private String name;
     private  double value;

   

    public BankAccont() {
    }
     public BankAccont(long account, String name, double initialDeposit) {
        this.account = account;
        this.name = name;
         desposit(initialDeposit);
    }
     public BankAccont(long account, String name) {
        this.account = account;
        this.name = name;
        value = 0;
    }

    

    public long getNum() {
        return account;
    }

    public String getName() {
        return name;
    }

    public double getValor() {
        return value;
    }
    public void setName(String name) {
        this.name = name;
    }
    /**
     * This methe gonna add on the bankAccount 
     * @return 
     */
    public double desposit(double value){
        return this.value+=value;
    }
    /**
     * This methode gonna withdraw the money
     * @param value
     * @return 
     */
     public double withdraw(double value){
        return this.value-=value+taxa;
    }
     @Override
    public String toString(){
        return "Accout "
                +account
                +" Holder : "
                +name
                +"Balance: $ "
                +value;
    }
}
