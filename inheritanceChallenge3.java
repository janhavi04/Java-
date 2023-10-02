
class Customer{

    protected String name;
    protected String phoneNo;

    public Customer(String name, String phonenum){
        this.name = name;
        phoneNo = phonenum;
    }
    public String getName(){
        return name;
    }
    public String getphNo(){
        return phoneNo;
    }
    public int payBill(int amt){
        return amt;
    }
}
class Member extends Customer{
    public Member(String name, String phonenum) {
        super(name, phonenum);
        //TODO Auto-generated constructor stub
    }

    private String cust_Id, address,dob;

    public Member(String name, String phno, String cust_id, String add, String dob){
        super(name, phno);
        
        this.cust_Id = cust_id;
        address = add;
        this.dob = dob;
        

    }
    public String getcust_id(){
        return cust_Id;
    }
    public String getAdd(){
        return address;

    }

    public String getDob(){
        return dob;
    }

    public String callBack(){
        return "Offers, Discount etc";
    }
    public String toString(){
        return "Name: "+name +"\nPhone Number:"+phoneNo+"\nCustomer ID: "+cust_Id+"\nAddress: "+address+"\nDOB: "+dob;
    }
}


class inheritanceChallenge3{
    public static void main(String[] args){

        Customer customer = new Customer("John" , "74585");
        Member mem = new Member("Jack", "785412","12534","Boston","14/5/2021");

        System.out.println(mem);


    }
}