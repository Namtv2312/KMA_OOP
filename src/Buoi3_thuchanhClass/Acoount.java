/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_thuchanhClass;

/**
 *
 * @author Administrator
 */
public class Acoount {
    public int id;
    public String name;
    public float balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float credit(int amount){
        return  (balance+amount);
}
    public float debit(int amount){
        return (balance - amount);
    }
    
    public void showInformation()
    {
        System.out.println("ID:"+ getId());
        System.out.println("Name: "+getName());
        System.out.println("Balance: "+getBalance());
        
    }
  /*  public static void main(String[] args) {
        Acoount ac = new Acoount(   );
        ac.setBalance(5);
        ac.setId(4);
        ac.setName("adf");
        ac.showInformation();
        System.out.println("Credit:"+ac.credit(5));
        System.out.println("Debit:"+ac.debit(5));
        
    }
*/
        
}
