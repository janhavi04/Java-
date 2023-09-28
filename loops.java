
class loops{

 //  public static int add(int n){
   //     if(n==0)
  //      return 0;
     //   else
    //    return n + add(n-1);
//
   // }

//    public static void even(int n){
//     while(n<21){
//         if(n%2 == 0){
//             System.out.println(n);

//         }
//         n++;
//     }
//    }
public static int factorial(int n){
//     int fact = 1;
//     while(n!=0){
//     fact= fact*n;
//     n--;
   
// }
//     return fact;
if(n == 0)
    return 1;
else
    return factorial(n-1)*n;
}
    public static void main(String[] args){
        //printing 1 to 10
        //for loop
       // for(int i =1 ; i<=10 ; i++){
       // System.out.println("Using for loop:");
       ///     System.out.println(i);
        //}
    //     int n = 10;
    //     System.out.println("Using while loop:");
    //    while (n!=0){
        
    //     System.out.println(n);
    //     n--;

    //     }

    //Sum of n natural number
   // int n =100;
   // System.out.println("Addition:" + add(n));

   //Printing even numbers from 1 to 20
//    int n = 1;
//    System.out.println("Even numbers from 1 to 20:");
//    even(n);


        //Factorial of a number
    //     int n;
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter a number:");
    //     n = s.nextInt();
    //     System.out.println("Factorial of " + n + " is ");
    //    System.out.println(factorial(n));
   
    //Multiplication table

    // int n;
    // Scanner s = new Scanner(System.in);
    // System.out.println("Enter a number:");
    // n = s.nextInt();
    // int i =1;
    // while(i<=10){
    //     System.out.println(n + " x " + i + " = " + n*i);
    //     i++;
    // }
//         String s;
//         boolean flag = true;
//         Scanner str = new Scanner(System.in);
//     System.out.println("Enter a word:");
//     s = str.nextLine().toLowerCase();
//     int left =0, right = s.length() - 1;

//     while(left<right){
//        if( s.charAt(left) != s.charAt(right)){
//         flag = false;
//         break;
//        }
//         left++;
//         right--;
//     }
// if(flag)
//     System.out.println("Given string is palindrome");
// else
//     System.out.println("Not palindrome");

int n = 0;
int n1 = 1;
int fib = 0;
while(n<=10){
    fib = n +n1;
    n = n1;
    n1 = fib;
    System.out.println(fib);
}

    }
}
