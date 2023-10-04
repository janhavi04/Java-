import java.util.Scanner;

/**
 * tryAndCatchDemo
 */

public class tryAndCatchDemo {

    public static void main(String[] args){
    //     int a ,b,c;
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter 2 num:");
    //     a = s.nextInt();
    //     b = s.nextInt();

    //     try{
    //     c = a/b;
    //     System.out.println(c);
    //     }

    //     catch(ArithmeticException e){
    //         System.out.println(e);
    //     }
    //    System.out.println("BYE");


    //Multiple Nested catch
    int A[] = {30,20,10,40,0};
    try{
    
        int c = A[0]/A[4];
     System.out.println("Division is " + c);
    
     try{
            System.out.println(A[2]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Index is Invalid");
    }

    }
    catch(ArithmeticException e)
    {
        System.out.println("Denominator should not be 0");
    }
    
  
    System.out.println("BYE");

    }
    
}