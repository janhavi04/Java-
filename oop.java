
class Circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circumference(){
        return perimeter();
    }
}
class Rectangle{
    public double length, breadth;


 public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSqaure(){
       if(length == breadth)
        return true;
       else
        return false;
    }
}

class Cylinder{
    public double radius,height;

    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea(){
         return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){

        return lidArea()*height;

    }
}
public class oop {

    public static void main(String[] args){
    

        // Circle c1 = new Circle();
        // c1.radius = 7;
        // System.out.println("Area: " +c1.area());
        // System.out.println("Perimeter: "+c1.perimeter());
        // System.out.println("Circumference: "+ c1.circumference());

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.length = 5.5;
        r1.breadth = 7;

        r2.length =5;
        r2.breadth = 5;

        System.out.println("Rectangle 1:");
        System.out.println("Area: " +r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
        System.out.println("Perimeter: "+r1.isSqaure());


        System.out.println("Rectangle 2:");
        System.out.println("Area: " +r2.area());
        System.out.println("Perimeter: "+r2.perimeter());
        System.out.println("Perimeter: "+r2.isSqaure());

    }
}