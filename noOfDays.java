import java.util.Scanner;
public class noOfDays {

    public static boolean leap_year(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else{
                return true;}
        } else
            {return false;}

    }
public static void checkDays(int month,int year){
    if(leap_year(year))
        month = 13;

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Days: 31");
                break;
            case 2:
                System.out.println("Days: 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Days: 30");
                break;
            case 13:
                System.out.println("Its a leap year.Days: 29");
                break;
        
        }
}
   

     public static void main(String[] args) {
        int month, year;
        System.out.println("Enter month and year");
        Scanner s = new Scanner(System.in);
        month = s.nextInt();
        year = s.nextInt();
        checkDays(month, year);

    }
}



