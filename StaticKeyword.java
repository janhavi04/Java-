

// class HondaCity{
//     static long price = 10;
//     int a,b;

//     static double onRoadPrice(String city){
//         switch(city){
//             case "delhi":
//                 return price + price*0.1;
//             case "Mumbai":
//                 return price+price*0.09;

                

//         }
//         return price;
//     }
// }

//Static Block

class My{
    static int s;
    static{
        System.out.println("Block 1");
        s=10;
    }

    
}
public class StaticKeyword {
    public static void main(String [] args){
        // HondaCity h1 = new HondaCity();
        // HondaCity h2 = new HondaCity();
        
        // // h1.price =20;
        // // System.out.println(h1.price);
        // // System.out.println(h1.price);
        // System.out.println(HondaCity.onRoadPrice("Mumbai"));
        System.out.println("Main");
     My m = new My();
     
    
        

    }

       static{
        System.out.println("Block 2");
    }

     
}