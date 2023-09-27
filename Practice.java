import java.lang.*;
import java.util.*;

// Write a program to calculate and print the sum of all even numbers between 1 and 100 using a while loop.
// public class Practice {

//     public static void main(String[] args){
//         int n =1, sum = 0;
//         while(n!=101){
//             if(n%2 == 0){
//                 sum = sum +n;
//             }
//             n++;

//         }
//         System.out.println(sum);
//     }
// }

//********************** Create a program that prompts the user to enter a series of numbers until they enter a negative number. *******/
//**********************Compute and display the average of all the entered numbers using a `while` loop. ********************/
// public class Practice {
//         public static void main(String[] args){
//                 Scanner s = new Scanner(System.in);
//                 int n = 0,sum =0;
//             while(n>=0){
//                 System.out.println("Enter number:");
//                  n = s.nextInt();
//                     if(n>0){sum += n;}

//             }

//             System.out.println("Sum is: "+ sum);

//         }
//     }

//***. Implement a C++ program to find and print the greatest common divisor (GCD) of two integers using the Euclidean algorithm with a `while` loop. */

//Create a program that simulates a basic calculator. Ask the user for two numbers and an operator (+, -, *, /), 
//and then perform the calculation using a `while` loop. Continue the calculation until the user chooses to exit.//
// public class Practice {

//     public static void calc(int n1, int n2, int op) {
//         boolean exit = false;
//         Scanner s = new Scanner(System.in);
//         while (!exit) {
//             switch (op) {

//                 case 1:
//                     System.out.println(n1 + n2);
//                     break;

//                 case 2:
//                     System.out.println(n1 - n2);
//                     break;

//                 case 3:
//                     System.out.println(n1 * n2);
//                     break;

//                 case 4:
//                     System.out.println(n1 / n2);
//                     break;
//                 default:
//                     System.out.println("Invalid operator");
//                     break;

//             }

//             System.out.println("Do you want to perform another calculation? (yes/no)");
//             String choice = s.next().toLowerCase();

//             if (choice.equals("no")) {
//                 exit = true;

//         }

//         else{
//              System.out.println("Enter first num:");
//          n1 = s.nextInt();
//         System.out.println("Enter second num:");
//          n2 = s.nextInt();
//         System.out.println("Choose 1 : +, 2 : -, 3 : *, 4 :/ ");
        
//          op = s.nextInt();
//         }

//     }
// }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter first num:");
//         int n1 = s.nextInt();
//         System.out.println("Enter second num:");
//         int n2 = s.nextInt();
//         System.out.println("Choose 1 : +, 2 : -, 3 : *, 4 :/ ");
        
//         int op = s.nextInt();

//         calc(n1, n2, op);

        

//     }
// }

//Create a C++ program that simulates a basic ATM machine. Allow the user to withdraw money from their account, deposit money, and check their account balance. 
//Use a `while` loop to keep the program running until the user chooses to exit.
class Practice{

    public static void atmMachine(int n){
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        boolean exit = false;
        while (!exit){
            switch (n) {
                case 1:
                    System.out.println("Enter the amount you wish to withdraw:");
                    int amt = s.nextInt();
                    System.out.println("Withdrawal successful:");
                    break;
                case 2:
                    System.out.println("Enter the amount you wish to deposit:");
                     amt = s.nextInt();
                    System.out.println("Deposit successful:");
                    break;
                    
                    
                case 3:
                    System.out.println("Enter your pin:");
                     int pin = s.nextInt();
                    System.out.print("You have "+ rand.nextDouble(1000 , 10000)); 
                    break;
                case 4: 
                     System.out.println("Thank you for using My ATM Machine.");
                    exit = true;
                    break;
                default:
                System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }

        }
    }
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
            System.out.println("Welcome to My ATM Machine:");
            System.out.println("Choose an option:");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Account Balance");
            System.out.println("4. Exit");
    int n = s.nextInt();
    atmMachine(n);




}

}
