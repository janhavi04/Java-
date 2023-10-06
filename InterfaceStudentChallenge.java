/**
 * InterfaceStudentChallenge
 */

interface Member {
    void callback();
 }
 class Store{
    Member mem[] = new Member[100];
    int count =0;

    void register(Member m){
        mem[count++]= m;
    }
    void inviteSale(){
        for(int i =0; i<count; i++){
            mem[i].callback();
        }
    }
 }

 

 class Customer implements Member{
    String name;

    public Customer(String n){
        name = n;
   }
    public void callback(){
        System.out.println("OKAY, I will visit.-" + name);
    }
 }
public class InterfaceStudentChallenge {

    public static void main(String[] args){
        Store s = new Store();

        String []customerName = {"Jane", "John","Smith" ,"Alice","Albert"};
      
        for(String name: customerName){
        Customer c1 = new Customer(name);
        s.register(c1);
        }
        s.inviteSale();
    }
}