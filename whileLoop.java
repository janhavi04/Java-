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

 //public class whileLoop {

    // public static void main(String[] args){

//         int n = 1111,rem,rev =0;
//         int num = n;
//         while(n>0){
//             rem = n%10;
//             rev = rev * 10 +rem;
//             n/=10;

//         }
//         System.out.println("Reversed number is: "+ rev);

//         if(num == rev){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("NO");
//         }


//     }
// }


//**Counting by Threes:** Write a program that prints numbers from 3 to 30 in increments of 3 using a while loop.

//  public class whileLoop {

//      public static void main(String[] args){

//         int n =3;
//         while(n<31){
//             System.out.println(n);
//             n+=3;
            
//         }
//      }


//     }



    // **Factor Finder:** Write a program that asks the user to enter a number and then finds and prints all the factors of that number using a while loop.


    // public class whileLoop {

    //     public static void main(String[] args){

    //         int n = 5,i=1;
    //             System.out.println("Factors of " + n + " are:");
    //         while(i<=n/2){

    //             if(n%i == 0){
    //                 System.out.println(i);
                    
    //             }
    //             i++;


    //         }
    //         System.out.println(n);


    //     }
    // }


   // **Vowel Counter:** Create a program that takes a string as input and counts and prints the number of vowels (a, e, i, o, u) in the string using a while loop.
import java.util.Scanner;
   public class whileLoop {

   public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = s.nextLine().toLowerCase();
        
        int lengthL = input.length();

        int count =0;
        int index =0;

        while(index < lengthL){

           char currentChar = input.charAt(index);

           if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'){
               count++;
           }

           index++;


        }
        System.out.println("Number of vowels in string :" + count);
        s.close();

   }
}
