// /**
//  * abstractClass
//  */

//   abstract class Super{
//     public Super(){
//         System.out.println("Super Constructor");
//     }

//     public void  meth1(){
//         System.out.println("Meth1 of Super");
//     }
//     abstract public void meth2();
//  }


// class sub extends Super{
 
//     public void meth2(){
//             System.out.println("Meth2 of Sub");
//         }

//         public void meth3(){
//             System.out.println("Meth3 of Sub");
//         }
// }

// public class abstractClass {
//     public static void main(String[] args){
//         Super s =new sub();
//         s.meth1();
//         s.meth2();
//         ((sub)s).meth3(); // calling extra method of the child class
//     }
    
// }


///************CHALLENGE************************ */

/**
 * InnerabstractClass
 */

 abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
 }

 class Circle extends Shape{

    private double radius;

    double getRadius(){
        return radius;
    }
    void setRadius(double r){
        radius = r;
    }
   public double perimeter(){
        return 2 * Math.PI *radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return "Perimeter: "+ String.format("%.2f", perimeter())+ "\nArea: " +String.format("%.2f", area());
    }
 }

 class Rectangle extends Shape{
    private double length, breadth;
    double getLength(){
        return length;
    }
    void setLength(double l){
        length = l;
    }

    double getBreadth(){
        return breadth;
    }
    void setBreadth(double b){
        breadth = b;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

   public double area(){
        return length*breadth;
    }

     public String toString(){
        return "Perimeter: "+ String.format("%.2f", perimeter())+ "\nArea: " +String.format("%.2f", area());
    }
 }

public class abstractClass {
 public static void main(String[] args){
//     Circle c = new Circle();
//     Shape s = c;
    
//    System.out.print( s.area());
    // Shape s1 = new Circle();
    // Shape s2 = new Rectangle();

    
    // ((Circle)s).setRadius(5.5);
    // ((Rectangle)s2).setLength(10);
    // ((Rectangle)s2).setBreadth(5);
    // System.out.println("Details:\n " + s1);
    // System.out.println("Details:\n " + s2);

 }
    

}
