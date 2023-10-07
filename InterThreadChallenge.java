class whiteBoard
{
    String text;
    int noOfStudent = 0;
    int count =0;

 public void attendance(){
        noOfStudent++;
    }

   synchronized public void write(String text){
    System.out.println("Teacher is writing " + text);
    while(count!=0){
        try{wait();}catch(Exception e){}

    this.text = text;
    count = noOfStudent;
    notifyAll();
    }


    }
   synchronized public String read(){
        while(count==0){
            try{wait();}catch(Exception e){}
        }
        String t = text;
        count--;
        if(count==0)
            notify();
        return t;


    }
    
}

class Teacher extends Thread{
    whiteBoard wb;
    String notes[] = {"Java is a language", "It is OOPs", "It is Platform Independent", "It supports thread" , "end"};

    public Teacher (whiteBoard w){
        wb = w;
    }

    public void run(){

        for(int i =0;i<notes.length;i++){
            wb.write(notes[i]);
        }

    }
}

class Student extends Thread{
    String name;
    whiteBoard wb;
    public Student(String name, whiteBoard w){
        this.name = name;
        wb =w;
    }

    public void run(){
        String text;
        wb.attendance();
        do{
            text = wb.read();
            System.out.println(name + "Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));

    }

}
public class InterThreadChallenge 
{
    public static void main(String[] args) 
    {

        whiteBoard w = new whiteBoard();

        Teacher t = new Teacher(w);

        Student s1 = new Student("1.Rohan", w);
        Student s2 = new Student("2. Roy", w);
        Student s3 = new Student("3.Steve", w);

        t.start();

        s1.start();
        s2.start();
        s3.start();
    }
}