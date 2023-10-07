/**
 * InterThread
 */
// class MyData
// {
//     int value;
//     boolean flag=true;
    
//     synchronized public void set(int v)
//     {
//         while(flag!=true)
//             try {wait();}catch(Exception e){}
        
//         value=v;
//         flag=false;
//         notify();
//     }
    
//     synchronized public int get()
//     {
//         int x=0;
//         while(flag!=false)
//             try {wait();}catch(Exception e){}
        
        
//         x=value;
//         flag=true;
//         notify();
        
//         return x;            
//     }
// }

// class Producer extends Thread
// {
//     MyData data;
    
//     public Producer(MyData d)
//     {
//         data=d;
//     }
//     public void run()
//     {
//         int count=1;
//         while(true)
//         {
//             data.set(count);
//             System.out.println("Producer "+count);
//             count++;
//         }
//     }
// }

// class Consumer extends Thread
// {
//     MyData data;
    
//     public Consumer(MyData d)
//     {
//         data=d;
//     }
//     public void run()
//     {
//         int value;
//         while(true)
//         {
//             value=data.get();
//             System.out.println("Consumer "+value);
//         }
//     }
// }

// public class InterThread 
// {
//     public static void main(String[] args) 
//     {
//         MyData data=new MyData();
        
//         Producer p=new Producer(data);
//         Consumer c=new Consumer(data);
        
//         p.start();
//         c.start();
        
//     }
// }

/********************CHALLENGE_******************************* */


// class whiteBoard
// {
//     String text;
//     int noOfStudent = 0;
//     int count =0;

//  public void attendance(){
//         noOfStudent++;
//     }

//    synchronized public void write(String text){
//     System.out.println("Teacher is writing " + text);
//     while(count!=0){
//         try{wait();}catch(Exception e){}

//     this.text = text;
//     count = noOfStudent;
//     notifyAll();
//     }


//     }
//    synchronized public String read(){
//         while(count==0){
//             try{wait();}catch(Exception e){}
//         }
//         String t = text;
//         count--;
//         if(count==0)
//             notify();
//         return t;


//     }
    
// }

// class Teacher extends Thread{
//     whiteBoard wb;
//     String notes[] = {"Java is a language", "It is OOPs", "It is Platform Independent", "It supports thread" , "end"};

//     public Teacher (whiteBoard w){
//         wb = w;
//     }

//     public void run(){

//         for(int i =0;i<notes.length;i++){
//             wb.write(notes[i]);
//         }

//     }
// }

// class Student extends Thread{
//     String name;
//     whiteBoard wb;
//     public Student(String name, whiteBoard w){
//         this.name = name;
//         wb =w;
//     }

//     public void run(){
//         String text;
//         wb.attendance();
//         do{
//             text = wb.read();
//             System.out.println(name + "Reading " + text);
//             System.out.flush();
//         }while(!text.equals("end"));

//     }

// }
// public class InterThread 
// {
//     public static void main(String[] args) 
//     {

//         whiteBoard w = new whiteBoard();

//         Teacher t = new Teacher(w);

//         Student s1 = new Student("1.Rohan", w);
//         Student s2 = new Student("2. Roy", w);
//         Student s3 = new Student("3.Steve", w);

//         t.start();

//         s1.start();
//         s2.start();
//         s3.start();
//     }
// }

class WhiteBoard
{
    String text;
    int numberOfStudents=0;
    int count=0;
    public void attendance()
    {
        numberOfStudents++;
    }
    
    synchronized public void write(String t)
    {
        System.out.println("Teacher is Writing " +t);
        while(count!=0)
                try{wait();}catch(Exception e){}
        text=t;
        count=numberOfStudents;
        notifyAll();

    }
    synchronized public String read()
    {
        
        while(count==0)
                try{wait();}catch(Exception e){}
            
        String t=text;
        count--;
        if(count==0)
                notify();
        return t;
    }
    
}
class Teacher extends Thread
{
    WhiteBoard wb;
    
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    
    public Teacher(WhiteBoard w)
    {
        wb=w;
    }
    
    public void run()
    {
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
    }          
    
}

class Student extends Thread
{
    String name;
    WhiteBoard wb;
    public Student(String n,WhiteBoard w)
    {
        name=n;
        wb=w;
    }
    
    public void run()
    {
        String text;
        wb.attendance();
                
        do
        {
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
    
}


public class InterThread 
{
    public static void main(String[] args) 
    {
        WhiteBoard wb=new WhiteBoard();
        Teacher t=new Teacher(wb);
        
        Student s1=new Student("1. John",wb);
        Student s2=new Student("2. Ajay",wb);
        Student s3=new Student("3. Kloob",wb);
        Student s4=new Student("4. Smith",wb);
        
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        
    }   
}