class cellphone{

    protected String phno, imeino;
    public cellphone(String phno, String imeino){
        this.phno = phno;
        this.imeino = imeino;

    }
    public String getphoneNo(){
        return phno;
    }

        public String getimeino(){
        return imeino;
    }
    
    public String call(){
        return "Call is being made";
    }

    public String sms(){
        return "SMS has been sent";
    }

    public String contact(String num){
        return num;
    }
    public String delete(){
        return "Contact has been deleted.";
    }
}

class smartPhone extends cellphone{
    public smartPhone(String phno, String i) {
        super(phno, i);
        //TODO Auto-generated constructor stub
    }

    private String macNo;
    public String play(){
        return "Music is playing.";
    }
    public String click(){
        return "Done";
    }

    public String Capture(){
        return "Image has been Captured";
    }

    public String toString(){
        return "Phone Number: " + phno +"\nIMEI NUmber: " + imeino;
    }
}
public class inheritanceChallenge2 {

    public static void main(String[] args){
 cellphone cellphone = new cellphone("985632","14253452");
    smartPhone smartphone = new smartPhone("7458263", "41256325");

    System.out.println(smartphone.click());
    System.out.println(smartphone.call());
    
    }
   
}