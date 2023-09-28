
import java.util.Scanner;

class swap{

    public static void main(String args[]){
        int a,b;
        System.out.println("Enter 2 numbers to swap:");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping a is " +a+" and b is "+b);

        s.close();
    }
}