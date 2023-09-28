
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
// import java.lang.*;
// import java.util.*;

// class Practice{
   
//    public static void atm(){
//             boolean exit = false;
//             int intialAmount = 10000;
//             int amt;
//             //int balance = intialAmount;
//             Scanner scanner = new Scanner(System.in);
           

//             while(!exit){
//                 System.out.println("Choose an option:");
//                 System.out.println("1. Withdraw Money");
//                 System.out.println("2. Deposit Money");
//                 System.out.println("3. Check Account Balance");
//                 System.out.println("4. Exit");

//                 int choose = scanner.nextInt();

//                 switch(choose){
//                     case 1:
//                         System.out.println("Enter the amount you wish to withdraw:");
//                         amt = scanner.nextInt();
//                         System.out.println("Withdraw Successful");
//                         intialAmount = intialAmount-amt;
//                         System.out.println("Total balance: " + intialAmount);
//                         break;

                        
//                     case 2:
//                         System.out.println("Enter the amount you wish to deposit:");
//                         amt = scanner.nextInt();
//                         System.out.println("Deposit Successful");
//                         intialAmount = intialAmount+amt;
//                         System.out.println("Total balance: " + intialAmount);
//                         break;

//                     case 3:
//                         System.out.print("Account Balance:" + intialAmount);
//                         break;
//                     case 4:
//                         System.out.println("Thank you for using our ATM");
//                         exit = true;
//                         break;
//                 }


//             }

            

//    }
// public static void main(String[] args){
// System.out.println("Welcome to MYATM");
// atm();

// }
// }


//*Sum of Digits:** Write a program that calculates and prints the sum of the digits of a given integer using a while loop. For example, if the input is 12345, the output should be 15.
// import java.lang.*;
//  import java.util.*;

// class Practice{
//     public static void main(String[] args){

//         int n = 1234,rem,sum =0;

//         while(n>0){
//             rem = n%10;
//             sum = rem + sum;
//             n /= 10;


//         }
//         System.out.println(sum);
//     }
// }


//*Number Repeater:** Ask the user to enter a number and a count. Write a program that uses a while loop 
//to print the number repeatedly for the specified count. For example, if the user enters 5 and 3, the program should print "5 5 5."




 import java.util.*;

class Practice{
     public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number and count:");
            int num = s.nextInt();
            int count = s.nextInt();
            int i = 1;

            while(i<=count){
                System.out.print(num + " ");
                i++;
            }

            s.close();


        
     }
    }