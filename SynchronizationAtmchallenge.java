/**
 * SynchronizationAtmchallenge
 */

    class ATM{
    
    synchronized public void checkBalance(String name){

        System.out.print( name + " is checking");
        try{
            Thread.sleep(100);
        }
        catch(Exception e){}
        System.out.println(" balance ");
    }

   synchronized public void withdraw(String name, int amt){
        System.out.print(name + " is withdrawing ");
         try{
            Thread.sleep(100);
        }
        catch(Exception e){}
        System.out.println(amt);
    }
 }

class Customer extends Thread{

    ATM atm;
    String name;
    int amount;

    Customer(String name, ATM a, int amount) {
        this.name = name;
        atm =a;
        this.amount =amount;
    }
    public void useAtm(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run(){
        useAtm();
    }

 }
public class SynchronizationAtmchallenge {

    public static void main(String []args){

        ATM access = new ATM();

         

        Customer c1 = new Customer("Rohan", access, 10000);
        Customer c2 = new Customer("Raj", access, 1000);
        // Customer c2 = new Customer("Mike", access, 1500);
        // Customer c3 = new Customer("Steve", access, 1200);


        c1.start();
        c2.start();
        // c3.start();
        // c4.start();
    }
}