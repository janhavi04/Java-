//******************STUDENT ROLL NUMBER**************** */
import java.time.*;
// class Student{

//     private String rollNo;
//     private static int count = 1;
//     private String name;

//     //Generating a roll number:
//     private String generateRollNo(){
//         LocalDate date = LocalDate.now();
//         String rn = "Univ-"+(date.getYear()) +"-"+count;
//         count ++;
//         return rn;
//     }


//     public Student(String name){
//         this.name = name;
//         rollNo =generateRollNo();
//     }

//     public String getRollNo(){
//         return rollNo;
//     }


// }
// public class StudentRollChallenge {

//     public static void main(String [] args){

//         Student s1 = new Student("John");
//         Student s2 = new Student("Smith");
//         Student s3 = new Student("Candice");


//         System.out.println(s1.getRollNo());
//         System.out.println(s2.getRollNo());
//         System.out.println(s3.getRollNo());

//     }
// }


/********************ACCOUNT NUMBER GENERATION*************** */

// class Account{
//     private String accNo;
//     private String name;
//     private static int count = 1;

//     private String generateAccountNo(){

//     String aN = "BOB0-"+ count;
//     count++;
//     return aN;
//     }

//     String getAccountNo(){
//         return accNo;
//     }

//      Account(String name){
//         this.name = name;
//         accNo = generateAccountNo();
//     }
// }

// public class StudentRollChallenge {

//     public static void main(String [] args){

//         Account a1 = new Account("Sam");
//         Account a2 = new Account("ROhan");
//         Account a3 = new Account("Patrick");

//         System.out.println(a1.getAccountNo());
//         System.out.println(a2.getAccountNo());
//         System.out.println(a3.getAccountNo());

    
   

//     }
// }

//**********CUSTOMER ID GENERATION************ */
class Customer{

    private String custID;
    private String name;
    private String companyName;
    static int count = 1;

    private String generateCustID(){
        LocalDate date = LocalDate.now();
        String cid = companyName + "-"+ (date.getYear())+"-"+count;
        count++;
        return cid;
    }
    Customer(String name,String company){
        companyName = company;
        this.name = name;
        custID = generateCustID();
    }

    
    String getCustId(){
        return custID;
    }
}

public class StudentRollChallenge {

    public static void main(String [] args){

        Customer c1 = new Customer("Sam" , "Cognizant");
        Customer c2 = new Customer("ROhan" , "Wipro");
        Customer c3 = new Customer("Patrick", "Microsoft");

        System.out.println(c1.getCustId());
        System.out.println(c2.getCustId());
        System.out.println(c3.getCustId());

    
   

    }
}

