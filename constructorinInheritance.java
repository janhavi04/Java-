/**
 * constructorinInheritance
 */

 class Parent{
    public Parent(){
        System.out.println("Non-Param of Parent");
    }

    Parent(int x){
        System.out.println("Param of Parent "+ x);
    }
 }
 class Child extends Parent{
    public Child(){
        System.out.println("Non Param of Child");
    }

    Child(int x){
        System.out.println("Param of Child");
    }

    Child(int x, int y){
        super(x);
        System.out.println("Two param of Child "+y);
    }
 }
public class constructorinInheritance {
    public static void main(String [] args){
        Child c = new Child(5,10);
    }

    
}