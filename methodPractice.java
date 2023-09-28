/**
 * methodPractice
 */
public class methodPractice {

    static int max(int x, int y){
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args){

        int a , b , c;
        a = 10;
         b = 5;
        c = max(a,b);
        //methodPractice mp = new methodPractice(); //when creating an object then no need of static

        System.out.println(c);
        
    }
}