
// class Circle{
//     public double radius;

//     public double area(){
//         return Math.PI*radius*radius;
//     }
//     public double perimeter(){
//         return 2*Math.PI*radius;
//     }

//     public double circumference(){
//         return perimeter();
//     }
// }
// class Rectangle{
//     public double length, breadth;


//  public double area(){
//         return length*breadth;
//     }
//     public double perimeter(){
//         return 2*(length+breadth);
//     }

//     public boolean isSqaure(){
//        if(length == breadth)
//         return true;
//        else
//         return false;
//     }
// }

// import java.text.DecimalFormat;

// class Cylinder{
//     public double radius,height;

//     public double lidArea(){
//         return Math.PI*radius*radius;
//     }

//     public double totalSurfaceArea(){
//          return 2*Math.PI*radius*(radius+height);
//     }
//     public double volume(){

//         return lidArea()*height;

//     }
// }

class Student{
    public int roll,m1,m2,m3;
    public String name,course;

    public int total(){
        return m1+m2+m2;
    }
    public float average(){
        return (float)total()/3;

    }

    public char grade(){

        if(average() >70)
            return 'A';
        else
            return 'B';

    }
    public String toString(){
        return "Roll no:" + roll + "\n" + "Name:" +name +"\n" + "Course: " + course;
    }


}
public class oop {

    public static void main(String[] args){
    

        // Circle c1 = new Circle();
        // c1.radius = 7;
        // System.out.println("Area: " +c1.area());
        // System.out.println("Perimeter: "+c1.perimeter());
        // System.out.println("Circumference: "+ c1.circumference());

        // Rectangle r1 = new Rectangle();
        // Rectangle r2 = new Rectangle();

        // r1.length = 5.5;
        // r1.breadth = 7;

        // r2.length =5;
        // r2.breadth = 5;

        // System.out.println("Rectangle 1:");
        // System.out.println("Area: " +r1.area());
        // System.out.println("Perimeter: "+r1.perimeter());
        // System.out.println("Perimeter: "+r1.isSqaure());


        // System.out.println("Rectangle 2:");
        // System.out.println("Area: " +r2.area());
        // System.out.println("Perimeter: "+r2.perimeter());
        // System.out.println("Perimeter: "+r2.isSqaure());

        // Cylinder cy1 = new Cylinder();
        // cy1.height = 7.9;
        // cy1.radius = 5.1;

        // // Create a DecimalFormat object for formatting with 2 decimal places
        // DecimalFormat decimalFormat = new DecimalFormat("#.##");

        // // Calculate the attributes
        // double lidArea = cy1.lidArea();
        // double totalSurfaceArea = cy1.totalSurfaceArea();
        // double volume = cy1.volume();

        // // Format and print the results with 2 decimal places
        // System.out.println("Area: " + decimalFormat.format(lidArea));
        // System.out.println("Perimeter: " + decimalFormat.format(totalSurfaceArea));
        // System.out.println("Circumference: " + decimalFormat.format(volume));


        // double lidArea = cy1.lidArea();
        // double totalSurfaceArea = cy1.totalSurfaceArea();
        // double volume = cy1.volume();

        // // Format and print the results with 2 decimal places
        // System.out.println("Area: " + String.format("%.2f", lidArea));
        // System.out.println("Perimeter: " + String.format("%.2f", totalSurfaceArea));
        // System.out.println("Circumference: " + String.format("%.2f", volume));

        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Sab Chatterbox";
        s1.course = "BCA";
        s1.m1 = 70;
        s1.m2 = 80;
        s1.m3 = 90;
        float avg = s1.average();
        System.out.println("Total: " + s1.total());
        System.out.println("Average:"+ String.format("%.2f",avg));
        System.out.println("Details:\n " + s1);



    }
}


