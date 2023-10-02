import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * studentAndSubjects
 */
class Subject{
    private String subId, name;
    private int maxMarks, marksObtain;

    public Subject(String subId, String name,int maxMarks){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    public Subject(String subId, String name, int maxMarks, int marksObtain){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;

    }
    public String getsubId(){
        return subId;
    }

    public String getname(){
        return name;
    }
    public int getmaxMarks(){
        return maxMarks;
    }
    public int getmarksObtain(){
        return marksObtain;
    }

    public void setmarksObtain(int marks){
        marksObtain = marks;
    }

    public boolean isQualified(){
        return marksObtain>=maxMarks/10*4;
    }

    public String toString(){
        return "Subject Id: " +subId + "\nName: "+ name +"\nMaximum marks: "+ maxMarks + "\nMarks Obtained :" + marksObtain;
    }
}

class Student{

    private String rollNo, name,dept;
    private String[] subjects;

    public Student(String rollNo, String name, String dept, String[] subjects){
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        setSubjects(subjects);

    }

    public String getrollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }

    public String[] getSubjects(){
        return subjects;

    }

    public void setSubjects(String ...subs){
        this.subjects = subs;
    }

     public String display(){
        return "Roll No: " +rollNo + "\nName: "+ name +"\nDepartment: "+ dept + "\nSubjects: " + Arrays.toString(subjects);
    }
}
public class studentAndSubjects {
    public static void main(String[] args){

        // Subject s = new Subject("A1", "Neet", 720, 450);

        // Subject subs[] = new Subject[3];
        // subs[0] = new Subject("P1", "Physics", 180);
        // subs[1] = new Subject("C1", "Chemistry", 180);
        // subs[2] = new Subject("B1", "Biology", 180);
        
        // for(Subject sub : subs){
        //     System.out.println(sub);

        // }

        Student[] s = new Student[3];
        s[0] = new Student("1", "Bhakti Choudhary", "NEET", new String[]{"Bio","Chemistry","Physics"});
        s[1] = new Student("2", "Chatterbox", "BCA", new String[]{"S102","S103"});
        s[2] = new Student("3","James Clear","Literature",new String[]{ "L1","L2","L3","L4"});

        for(Student students : s){
            System.out.println(students.display());;
        }

        
    
}
}