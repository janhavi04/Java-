//Develop a C++ program that uses a switch-case statement to take the month as input (1 to 12) 
//and determines the season (e.g., spring, summer, fall, or winter) based on the month entered.
import java.util.Scanner;
class season{

    public static void checkSeason(int input){
        switch(input){
            case 1:
            case 2:
            case 12:
                System.out.println("Its Winter.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring is here");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("SummerTime.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Yeah its Autumn.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("ENter a integer from 1 to 12:"); 
        int input = s.nextInt();

        checkSeason(input);


    }
}