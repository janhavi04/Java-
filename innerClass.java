
//INNER CLASS
//1. NESTED INNER CLASS
//To reduce the complexity of outer class we use inner class
// class Outer{
//     int x =10;
//     class Inner//Nested inner class
//     {
//         int y =20;
//         void innerDisplay(){
//             System.out.println(x);//Member of outer class is accessible
//             System.out.println(y);
//         }
//     }
//     void outerDisplay(){
//         Inner i = new Inner();//Outer class will use the object of inner class
//         i.innerDisplay();
//         System.out.println(i.y); 

//     }
// }

//2.Local Inner class
// class Outer{
//     public void display(){
//         class Inner //Local inner class 
//                     //This class will only  be visible inside the method
//         {
//             void innerDisplay(){
//                 System.out.println("Hello WOrld"); 
//             }
//         }

//         // Inner i = new Inner();//Creating object of Inner
//         // i.innerDisplay();


//         //Annoynmous object
//         new Inner().innerDisplay(); //object is not having any refernce

//     }
// }

//3. ANOYMOUS INNER CLASS
//THis inner class can be defined at the time of creation of object itself
//Useful for interfaces and abstract class

// interface My{
//     abstract void display();
// }

// class Outer{
//     public void meth(){

//         //With reference
//         // My m = new My(){ //defining an anonymous class
//         //     public void display(){
//         //         System.out.println("Hello");
//         //     }
//         // };

//         //Without Reference
//         //Anoymous object as well as anonymous class
//          new My(){ //defining an annonymous class
//             public void display(){
//                 System.out.println("Hello");
//             }
//         }.display();

//       //  m.display();
//     }
// }

//4.Static Inner Class
//Static inner classes are the static members of the outer classes,
//and object of static inner classes can be created outside outer class 
//and you dont have to create the object of the outer class
//They can access only the static members not the non static members


class Outer{
    static int x =10;
    int y =20;
    static class inner{
        void display(){
            System.out.println(x); //Can access static memeber
            //System.out.println(y); //cannot access as it is a non static member
        }
    }
}



public class innerClass {

    public static void main(String[] args){
        //For nested inner class
        // Outer o = new Outer();
        // o.outerDisplay();
        // Outer.Inner i = new Outer().new Inner();

        //For Local Inner class
        // Outer o = new Outer();
        // o.display();

        //For Annoymous Inner Class
        // Outer o = new Outer();
        // o.meth();

      //  For Static inner class
        Outer.inner i = new Outer.inner();//for static inner class
        i.display();


    } //Compiler will generate Outer.class and Outer$inner.class
}



