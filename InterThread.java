/**
 * InterThread
 */

 class MyData{
    int value;
    boolean flag = true;
   synchronized public void set(int v){

    while(flag!=true){
        try{wait();}catch(Exception e){}
    }
    flag = false;
        notify();
        value =v;
    }

   synchronized public int get(){
        int x =0;
          while(flag!=false){
        try{wait();}catch(Exception e){}
    }
        x =value;
        flag = true;
        notify();
        return x;
    }
 }

 class Producer extends Thread
{
    MyData data;

   public Producer(MyData d){
        data  =d;
    }
    public void run(){
        int count = 1;
        while(true){
            data.set(count);
            System.out.println("Producer " +count);
            count++;

        }
    }


}

class Consumer extends Thread
{
    MyData data;

   public Consumer(MyData d){
        data  =d;
    }
    public void run(){
        int value;
        while(true){
           value = data.get();
           System.out.println("Consumer " +value);
         
        }
    }


}
public class InterThread {

    public static void main(String [] args){

        MyData d = new MyData();
        Producer p = new Producer(d);
        Consumer c =new Consumer(d);

        p.start();
        c.start();

    }
}