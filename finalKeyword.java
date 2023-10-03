
class My{
    //final Variable
    final int MIN =1; //1st method of initializing
    final int NORMAL;
    final int MAX;

    static{
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
    void meth1(){
        System.out.println("WElcome");
    }
}
public class finalKeyword {

    public static void main(String [] args){

    }
}