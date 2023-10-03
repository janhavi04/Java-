/**
 * abstractClass
 */

  abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }

    public void  meth1(){
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
 }


class sub extends Super{
 
    public void meth2(){
            System.out.println("Meth2 of Sub");
        }

        public void meth3(){
            System.out.println("Meth3 of Sub");
        }
}

public class abstractClass {
    public static void main(String[] args){
        Super s =new sub();
        s.meth1();
        s.meth2();
        ((sub)s).meth3();
    }
    
}