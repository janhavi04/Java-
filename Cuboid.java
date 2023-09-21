import java.lang.*;
import java.util.Scanner;

/**
 * Cuboid
 */
public class Cuboid {

    public static  void main(String args[]){
        double length, height, breadth, area, volume;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the l,b,h:");
        length = s.nextDouble();
        breadth = s.nextDouble();
        height  = s.nextDouble();
        area = 2*(length*breadth+breadth*height+length*height);
        volume = length*breadth*height;

        System.out.println("Total Surface area of cuboid is " + area + "and the volume of cuboid is "+ volume);

    }
}