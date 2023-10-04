class NegativeDimension extends Exception // Creating Exceptions
{
    public String toString(){
        return "Dimensions of a Rectangle cannot be negative";
    }
}
public class throwVsThrows {

    //*********************THROW VS THROWS********************
    // static int meth1(){
    //     return 10/0;
    // }
    // static void meth2()
    // {
    //     meth1();
    // }
    // static void meth3(){
    //     meth2();
    // }

    static int area(int l,int b) throws NegativeDimension
    {
        if(l<0 || b<0)
            throw new NegativeDimension();
        return l*b;
    }
    static void meth1() throws NegativeDimension
    {
        System.out.println(area(10,-5));
    }


    /********************FINALLY****************************** */



    // static void meth1()throws Exception{
    //     try{

        
    //     throw new Exception();
    //     }
    //     finally{
    //     System.out.println("Final Message");
    // }

    public static void main(String [] args) throws Exception
    {
        //*********************THROW VS THROWS********************
        // try{
        // meth3();
        // // }
        // catch(Exception e){
        //     System.out.println(e);
        //         }
        try {
            meth1();
        } catch (NegativeDimension e) {
            System.out.println(e);
        }

               

        /********************FINALLY****************************** */

            // try {
            //     System.out.println(10/0);
            // }
            // catch(ArithmeticException e){
            //     System.out.println(e);
            // }
            // finally{

            //     System.out.println("Final Message");
            //  }
                 
    }
}