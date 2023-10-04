class CoffeeMachine{
    private float waterQty;
    private float sugarQty;
    private float coffeeQty;
    private float milkQty;

   //static private CoffeeMachine my = null; //my serves as a reference to the single instance of the CoffeeMachine class.
    static int count =0;
    private CoffeeMachine(){
        waterQty =1;
        sugarQty =1;
        coffeeQty =1;
        milkQty =1;
    }

    void fillSugar(int qty){
        sugarQty = qty;

    }
    void fillWater(int qty){
        waterQty =qty;
    }

    public float refillCoffee(){
        return 0.15f;
    }

    //Here The getInstance() method doesn't specify a return type 
    //because it returns an instance of the CoffeeMachine class itself. 
    //In Java, when a method returns an instance of its own class (in this case, an instance of the CoffeeMachine class), 
    //it is known as a factory method or a static factory method.


    static public CoffeeMachine getInstance(){
        // if(my == null){
        //     my = new CoffeeMachine();
        // }
        // return my;

        //Limit is set to 5
        if(count<5){
            count ++;
             return new CoffeeMachine();
        }
        else
            return null;
    }
}
public class SingletonExample {
    public static void main(String[]args){
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();

        System.out.println(m1 + " " +m2+ " "+m3);

        // if(m1 ==m2 && m1 ==m3)
        // System.out.println("SAME"); 
        }
    
}