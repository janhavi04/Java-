
import java.util.*;

/**
 * Quadratic
 */
class Quadratic {

    public static void main(String args[]){
       double a, b,c,r1,r2;
       System.out.println("Enter 3 numbers:");
       Scanner s = new Scanner(System.in);
       
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
       r1 = (-b + Math.sqrt((b*b)-4*a*c))/(2*a);
       r2 = (-b - Math.sqrt((b*b)-4*a*c))/(2*a);
       
       System.out.println("1st root is :" + r1);
        System.out.println("2nd root is :" + r2);
        s.close();

    } 
}