
class Super{
    public void meth1(){
        System.out.println("Super Meth1");
    }
    public void meth2(){
        System.out.println("Super Meth2");
    }
}

class Sub extends Super{
    public void meth2(){
        System.out.println("Sub Meth2");
    }
    public void meth3(){
        System.out.println("Sub Meth3");
    }

}
public class dynamicDispatch {

    public static void main (String[] args){
        // Sub s = new Sub();
        // s.meth1();
        // s.meth2();
        // s.meth3();

        Super s = new Sub();
        s.meth2();
    }
}