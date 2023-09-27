import java.util.Scanner;

/**
 * alphaOrDigit
 */
public class alphaOrDigit {
public static void checkChar(char lowerCaseInput){
    char letter;

    if(lowerCaseInput >= 'a' && lowerCaseInput<='z'){
        if(lowerCaseInput == 'a' || lowerCaseInput == 'e' || lowerCaseInput == 'i' || lowerCaseInput == 'o' || lowerCaseInput == 'u' )
        {
            letter =  'A';
        }else{
            letter= 'B';
        }
    }
    
    else if(lowerCaseInput >= '0' && lowerCaseInput <= '9')
    {
        letter= 'C';
    }
    else
     {
        letter= 'D';
    }

    switch(letter){
        case 'A':
            System.out.println("Its a vowel");
            break;
        case 'B':
            System.out.println("its a consonant");
            break;
        case 'C':
            System.out.println("its a digit");
            break;
        case 'D':
            System.out.println("its a special character");
            break;
        default:
            System.out.println("Invalid input");
         break;

    }
       
  }
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character:");
        char input = s.next().charAt(0);
        char lowerCaseInput = Character.toLowerCase(input);

        checkChar(lowerCaseInput);

    }
}