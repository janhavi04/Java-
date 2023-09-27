//Create a C++ program that takes a day number (1 to 7) as input and
 //uses a switch-case statement to determine whether it's a weekday or a weekend day
/**
 * checkDay
 */
import java.util.Scanner;
public class checkDay {
    public static void check(int input){
        switch (input){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Its a weekday");
                break;
            case 6:
            case 7:
                System.out.println("Its a weekend");
                break;
        }
    }
public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("ENter a integer from 1 to 7:"); 
        int input = s.nextInt();

        check(input);


    }
    
}
  