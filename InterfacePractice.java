/**
 * InterfacePractice
 */

//  interface Test{
    
//     void meth1();
//     void meth2();
//  }

//  class Test2 implements Test{
//     public void meth1(){
//         System.out.println("Meth1");
//     }
//     public void meth2(){
//         System.out.println("Meth2");
//     }
//     public void meth3(){
//         System.out.println("Meth3");
//     }
//  }
// public class InterfacePractice {

//     public static void main(String[] args){

//         Test t = new Test2();
//         t.meth1();
//         t.meth2();
//         ((Test2)t).meth3();
//     }
// }

/****************** EXAMPLE OF INTERFACE **********************/

// class Phone {
//     public void call() {
//         System.out.println("Phone call");
//     }

//     public void sms() {
//         System.out.println("Phone sending SMS");
//     }
// }

// interface Icamera {
//     void click();

//     void record();
// }

// interface IMusicPlayer {
//     void play();

//     void stop();
// }

// class SmartPhone extends Phone implements Icamera, IMusicPlayer {

//     public void videoCall() {
//         System.out.println("Smart Phone video calling");
//     }

//     public void click() {
//         System.out.println("Smart Phone Clicking Pictures");
//     }

//     public void record() {
//         System.out.println("Smart Phone recording video ");
//     }

//     public void play() {
//         System.out.println("Smart Phone playing music ");
//     }

//     public void stop() {
//         System.out.println("Smart Phone stopped music ");
//     }

// }

// public class InterfacePractice {

//     public static void main(String[] args) {

//         IMusicPlayer s = new SmartPhone();
//         // s.call();
//         // s.sms();
//         //s.click();
//          s.play();

//     }

// }


/************RULES******************* */


interface Test{

    final static int x =10; //It can have identifier and it is final and static by default
    public abstract void Meth1(); 
    void Meth2();// by default interface is public and abstract
    public static void Meth3() //interface method can have body by using static keyword
    {
        System.out.println("Meth3 of Test");
    }
  

    private void Meth6()//Private method cant be abstract
    {
        System.out.println(" Private Meth6 of Test");
    }
    default void Meth5() //From Java * default methods  are also allowed in interfaces
    {
        System.out.println(" Default Meth5 of Test");
        Meth6();
    }

}

interface Test2 extends Test //Interface can be extended by another interface
{
    void Meth4();
}

class My implements Test2{

    public void Meth1(){
       
    }
    public void Meth2(){
        
    }
    public void Meth4(){
        
    }
    
    
}
public class InterfacePractice {
    public static void main(String[] args) {
    
    System.out.println(Test.x);
    Test.Meth3(); //calling static method
    My m = new My();
    m.Meth5(); // calling default method
    
    }
}
