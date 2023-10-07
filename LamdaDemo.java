/**
 * LamdaDemo
 */
// @FunctionalInterface
//  interface MyLamda{

//     public int add(int x, int y);//Functional interface: interface having a single method only
// }
// // class My implements MyLamda{
// //     public void display(){
// //         System.out.println("Hello World");
// //     }
// // }
// public class LamdaDemo {

//     public static void main(String [] args){

//          //Lambda Expression
//         MyLamda m = (a,b) -> a+b;
//         System.out.println(m.add(200, 30));     
      
       

//     }
// }

/******************************************************************** */

// interface MyLamda{

//     public void display();
// }

// class UseLambda{
//     public void callLambda(MyLamda m){
//         m.display();
//     }
// }

// class Demo{
//     int temp = 10;
//     public void method1(){
//     //         int count =0;
//     //     MyLamda m=() -> {
        
           
//     //         System.out.println("HI");
//     //         System.out.println("bye");
//     //         System.out.println("Welcome" + (++temp));
    
//     // };
//     // m.display();



//     UseLambda ul = new UseLambda();
//     ul.callLambda(() -> {System.out.println("Hello");});
//     }
// }
// public class LamdaDemo {

//     public static void main(String [] args){

//         Demo d = new Demo();
//         d.method1();

//             }
// }


/***********************CAlculator*********************** ******/


/**
 * LamdaDemo
 */
// import java.util.*;

//  interface Calculator{

//     public int calc(int a, int b , String op);
//  }
// public class LamdaDemo {

//     public static void main(String[]args){
//         Calculator c = (x,y,z) -> {
//             if(z.equals("+")){
//                 return x+y;
//             }
//              else if(z.equals("-")){
//                 return x-y;
//             }
//              else if(z.equals("*")){
//                 return x*y;
//             }
//             else if(z.equals("/")){
//                 return x/y;
//             }
//             return -1;


//         };

//         System.out.println(c.calc(10, 20, "-"));

//     }
// }

 interface MyLamda{
        public int display(String str1 ,String str2);
    }


public  class LamdaDemo {

    // public static void reverse(String str){
    //     StringBuffer sb = new StringBuffer(str);
    //     sb.reverse();
    //     System.out.println(sb);
    // }
   
    LamdaDemo(String s){
        System.out.println(s.toUpperCase());
    }


    public static void main(String[]args){


        MyLamda ml = String::compareTo;

      System.out.println(  ml.display("helo","hello"));
   


 }
}

