
 class Super{
 public void display(){
        System.out.println("Super Class Display");
        
    }
 }
 class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Class Display");
      
    }
 }
public class methodOverriding {
    public static void main(String[] args){
        Super sup = new Super();
        sup.display();

        Sub s = new Sub();
        s.display();

       // Dynamic method dispatch
        // Super sup = new Sub();
        // sup.display();
    }
    
}



//******************TV EXAMPLE*********************** */

// class TV{
//     public void changeChannel(){
//         System.out.println("TV Channel is Changed");
//     }
//     public void switchOn(){
//          System.out.println("Tv is Switched on");
//     }
// }

// class SmartTV extends TV{
//     public void changeChannel(){
//         System.out.println("Smart TV Channel is Changed");
//     }
//     public void switchOn(){
//          System.out.println("Smart Tv is Switched on");
//     }
//     public void browse(){
//         System.out.println("Smart Tv is browsing");
//     }
// }
// public class methodOverriding {

//     public static void main(String[] args){
//         TV t = new SmartTV(); //Dynamic Method Dispatch i.e Super class reference holding the object of subclass and overrided method is called

//         t.changeChannel();
      
//         // t.switchOn();
//         // t.changeChannel();

//         // SmartTV st = new SmartTV();
//         // st.browse();
//         // st.changeChannel();
//     }
    
// }

//***********************CAR EXAMPLE************************** */
// class Car{
//     void start(){
//         System.out.println("Car started");
//     }
//     void accelerate(){
//          System.out.println("Car is accelerated");
//     }
//     void changeGear(){
//          System.out.println("Car gear changed");
//     }
// }
// class LuxuryCar extends Car{
    
//     void changeGear(){
//          System.out.println("Automatic Gear");

//     }
//     void openRoof(){
//          System.out.println("Sun roof is opened");
//     }

// }
// public class methodOverriding {
//     public static void main(String[] args){
//         Car c = new LuxuryCar();
//         c.start();
//         c.accelerate();
      
//         c.changeGear();

//     }
// }