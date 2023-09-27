/**
 * whileLoop
 */
//*Power of 2:** Write a program that calculates and prints the powers of 2 from 1 to 10 (2^1, 2^2, 2^3, etc.) using a while loop.
// public class whileLoop {

//     public static void main(String[] args){
//         int n = 1;
//         while(n!=10){
//             System.out.println(Math.pow(2,n));
//             n++;
//         }

//     }

    
// }


//**Reverse a Number:** Create a program that takes an integer as input and 
//prints the reverse of that number using a while loop. For example, if the input is 12345, the output should be 54321

 public class whileLoop {

     public static void main(String[] args){

        int n = 1111,rem,rev =0;
        int num = n;
        while(n>0){
            rem = n%10;
            rev = rev * 10 +rem;
            n/=10;

        }
        System.out.println("Reversed number is: "+ rev);

        if(num == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NO");
        }


    }
}