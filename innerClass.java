
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
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);

    }
}
public class innerClass {

    public static void main(String[] args){

    }
}