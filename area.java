import java.lang.*;
import java.util.Scanner;

class area{

    public static void main(String args[]){
       double  area,s1,s2,s3,s;
       System.out.println("ENter the value of three sides of the triangle:");
        Scanner sc = new Scanner(System.in);
       // base = s.nextFloat();
        //height = s.nextFloat();

        //area = base*height/2;

        s1 = sc.nextFloat();
        s2 = sc.nextFloat();
        s3 = sc.nextFloat();
        s = 0.5f*(s1+s2+s3);
        area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("Area of a triangle is " + area);

    }
}