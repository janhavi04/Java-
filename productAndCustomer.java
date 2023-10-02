/**
 * productAndCustomer
 */

class Product
{

private int quantity;
private String  itemno, name;
private double price;

public Product(String itemNo, String name,double price, int qty){
    this.itemno = itemNo;
    this.name = name;
    setprice(price);
    setqty(qty);

}

public String getitemno(){
    return itemno;
}


public String getname(){
    return name;
}


public double getprice(){
    return price;
}
public double getqty(){
    return quantity;
}


public void setqty(int q){
    quantity = q;
    
}
public void setprice(double p){
    price = p;
    
}

public String productDetails(){

    return "Item No: " + itemno +"\nName:" + name +"\nPrice: "+ price +"\nQuantity: "+ quantity;
}


}

class Customer{
    
    private String name, address,phone, custId;

    public Customer(String name, String address, String phone, String custId){
        this.name = name;
        this.custId = custId;
        setPhone(phone);
        setaddress(address);
    }

    public String getname(){
        return name;

    }
    public String getaddress(){
        return address;
    }
    public String getphone(){
        return phone;
    }
    public String getcustId(){
        return custId;
    }

    public void setPhone(String phone){
        this.phone = phone;


    }

    public void setaddress(String add){
        add = address;

    }

    public String customerDetails(){
        return ("Name: " +name + "\nAddress: "+ address + "\nphone: " + phone+ "\nCustomer Id: " + custId);
    }
}
public class productAndCustomer {

    public static void main(String[] args){

        Product p = new Product("A1", "Chips", 10, 2);

        // p.setprice(110);
        // p.setqty(12);

        System.out.println("Details: \n" + p.productDetails());


        Customer c = new Customer("James Clear", "Boston", "+91524632", "A0125");

        c.setPhone("85632541");

        System.out.println("Details:\n" + c.customerDetails());
    }
    
}