/**
 * SynchronizationAtmchallenge
 */
 class ATM{

   synchronized public void checkBalance(String name){
        System.out.println(name + " is checking balance" );
        try{Thread.sleep(100);}
        catch(Exception e){};
    }
   synchronized public void withdraw(String name, int balance){
        System.out.println (name + " is withdrawing " + balance);
         try{Thread.sleep(100);}
        catch(Exception e){};
    }

}
class Customer extends Thread{
    ATM atm;

    String name;
    int amount;

     public Customer(String name, ATM a,int balance){
        this.name = name;
        amount =balance;
        atm = a;
    }

    void useAtm(){

        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run(){
        useAtm();
    }
}
public class SynchronizationAtmchallenge {

    public static void main (String [] args){

        ATM a = new ATM();

        Customer c1 = new Customer("Raj", a, 1000);
        Customer c2 = new Customer("Riya",a, 2000);
        
        c1.start();
        c2.start();
    
    }
}