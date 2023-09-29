import java.util.Scanner;

/**
 * methodPractice
 */
public class methodPractice {

    // static int max(int x, int y){
    //     if(x>y)
    //         return x;
    //     else
    //         return y;
    // }
    // public static void main(String[] args){

    //     int a , b , c;
    //     a = 10;
    //      b = 5;
    //     c = max(a,b);
    //     //methodPractice mp = new methodPractice(); //when creating an object then no need of static

    //     System.out.println(c);

    // static void change(int X[], int index, int value){
    //         X[index] = value;
    // }
        
    // public static void main(String[] args){

    //     int A [] = {2,4,6,8,10,12};
    //     change(A,2,20);

    //     for(int x :A){
    //         System.out.print(x + " ");
    //     }
        //Factors of the given number
        // static void prime(int num){
           
        //         for(int i = 1; i<=num/2; i++){
        //             if(num%i == 0){
        //                 System.out.print(i+" ");
        //             }
                
        //     }
        //     System.out.print(num);

        // }
    // public static void main(String[] args){
        
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("ENter an integer:");
    //     int x = s.nextInt();
    //     System.out.println("The factor of given number are: ");
    //      prime(x);



        ////PRIME OR NOT



        // static boolean prime(int num){
        //    for(int i =2; i<=num/2;i++){
        //             if(num%i == 0)
        //                 return false;
        //     }
        //      return true;
            

        // }
        //  public static void main(String[] args){

        //         Scanner s = new Scanner(System.in);
        //         System.out.println("ENter an integer:");
        //         int x = s.nextInt();
        //        System.out.println(prime(x));

        //  }


        /***************GCD******************** */
        // static void gcd(int a, int b){
        //     int c = 0;

        //     while(a!=b){

        //     if(a>b)
        //         a -=b;
            
        //     else{
        //         b-=a;
        //     }
        //     }
        //     System.out.println(a);
            
        // }
        //        public static void main(String[] args){

        //         Scanner s = new Scanner(System.in);
        //         System.out.println("ENter two integer:");
        //         int x = s.nextInt();
        //         int y = s.nextInt();

        //         gcd( x, y);
        //  }


        //MAX IN AN ARRAY
            // static int max(int A[]){

            //     int max = A[0];
            //     for(int i =0 ; i<A.length;i++){
            //         if(A[i]>max)
            //             max =A[i];
                    
            //     }
            //     return max;

            // }
            //      public static void main(String[] args){
            //         int A[] = {8,3,15,9,7};
            //         System.out.println("Maximum element is " + max(A));

            //      }

              //Method overloading  
                // static int max(int x, int y){

                //     return x>y?x:y;
                // }

                //  static int max(int x, int y,int z){
                //     if(x>y&& x>z)
                //         return x;
                //     else if(y>z)
                //         return y;
                //      else
                //         return z;
                   
                // }
                //  public static void main(String[] args){
                // System.out.println(max(10,5,8) );
                // }
                
                //Overloaded method to calculate area
                // static double area(float l,float b){
                //     return l*b;
                // }
                // static double area(double r){
                //     return Math.PI*r*r;

                // }
                // static double area(double a, double b,double h){
                //     return 0.5 * (a+b) *h;
                // }
                // public static void main(String[] args){
                //      System.out.println("Rectangle");
                //     System.out.println(area(5.5f , 2.5f));
                //      System.out.println("Circle");
                //     System.out.println(area(5.5));
                //      System.out.println("Trapezium");
                //     System.out.println(area(5.5,2.5,1.5));


                // }

                 //Overloaded method to reverse an integer and an array

                //  static int reverse(int n){
                //     int rem,rev =0;
                //     while(n!=0){
                //         rem = n%10;
                //         rev = rev * 10 + rem;
                //         n/=10; 
                //     }
                //     return rev;

                //  }
                //  static int [] reverse(int A[]){
                //     int B[] = new int[A.length];
                //     for(int i = A.length-1,j=0 ;i>=0;i--,j++){
                       
                //          B[j] = A[i];
                //     }
                //     return B;
                    
                //  }


                //  public static void main(String[] args){
                //     int A[] = {1,2,3,4,5};
                //     int n = 12345;

                //     System.out.println(reverse(n));
                //    int []B = reverse(A);
                //    for(int i = 0; i <B.length;i++){
                //         System.out.print(B[i] + " ");
                //    }



     //Overloaded method to validate name and age 

                    static boolean validate(String name){

                        return name.matches("[a-zA-Z\\s]*");
                    }

                    static boolean validate(int age){
                        return age>=3 && age<=15;
                    }
                public static void main(String[] args){

                    System.out.println(validate(51));
                    System.out.println(validate("Janhavi"));
                 }

    }
