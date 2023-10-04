
class My{
    //final Variable cannot be changed
    final int MIN =1; //1st method of initializing
    final int NORMAL;
    final int MAX;

    {
        NORMAL =5; //2nd method of initializing
    }

    My(){
        MAX =10;//3rd method of initializing
    }
}

class Super{
    final void meth1(){
        System.out.println("HELOO");
    }
}

class Sub extends Super{
    // final methods cannot overriden a method
    // void meth1(){
    //     System.out.println("WElcome");
    // }
    void meth2(){
        System.out.println("WElcome");
    }
}
//final class cannot be extended
// final class Super1{

// }
// class Sub2 extends Super1{}
public class finalKeyword {

    public static void main(String [] args){

    }
}