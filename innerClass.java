
//INNER CLASS
//NESTED INNER CLASS
//To reduce the complexity of outer class we use inner class
class Outer{
    int x =10;
    class Inner//Nested inner class
    {
        int y =20;
        void innerDisplay(){
            System.out.println(x);//Member of outer class is accessible
            System.out.println(y);
        }
    }
    void outerDisplay(){
        Inner i = new Inner();//Outer class will use the object of inner class
        i.innerDisplay();
        System.out.println(i.y); 

    }
}
public class innerClass {

    public static void main(String[] args){
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner i = new Outer().new Inner(); //Accessing inner class outside the class

    } //Compiler will generate Outer.class and Outer$inner.class
}