/**
 * ThreadMethods
*/


import java.lang.*;
class Mythread extends Thread{

    public void run(){
     
        // setPriority(Thread.MAX_PRIORITY);
        int count =1;
        while(true){
            System.out.println(count+++ "My Thread");
        }
        //     try{
        //     Thread.sleep(10);
        //     }
        //     catch(InterruptedException e){
        //     System.out.println(e);
        //     }
    //}
    }
}

public class ThreadMethods 
{
    public static void main(String [] args) throws Exception
    {
        Mythread t = new Mythread();
       //t.setDaemon(true);
        t.start();
        // try{Thread.sleep(100);}
        // catch(Exception e){}

        // Thread mainThread = Thread.currentThread();
        // mainThread.join();
     
        // System.out.println("ID " +t.getId());
        // System.out.println("Name: "+ t.getName());
        // System.out.println("Priority:" + t.getPriority());
        // t.start();
        // System.out.println("State " +t.getState());
        // System.out.println("Alive "+ t.isAlive());
        int count =1;

        while(true){
            System.out.println(count+++ "My Main");
        }
        }
    }



    
