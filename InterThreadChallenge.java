/**
 * InterThreadChallenge
 */
class whiteBoard {
    String text;
    int noOfStudent = 0;
    int count = 0;

    public void attendance() {
        noOfStudent++;
    }

    synchronized public void write(String msg) {

        System.out.println("Teacher is writing");
        while (count != 0 || noOfStudent ==0 )
            try {
                wait();
            } catch (Exception e) {
            }
        ;
        text = msg;
        count = noOfStudent;
        notifyAll();
    }

    synchronized public String read() {
        while (count == 0)
            try {
                wait();
            } catch (Exception e) {
            }
        ;
        String t = text;
        count--;
        if (count == 0)
            notifyAll();
        return t;
    }

}

class Teacher extends Thread {
    whiteBoard wb;
    String notes[] = { "Java is OOP language", "It supports Thread", "End" };

    public Teacher(whiteBoard w) {
        wb = w;
    }

    public void run() {
        for (int i = 0; i < notes.length; i++)
            wb.write(notes[i]);

    }
}

class Student extends Thread {

    String name;
    whiteBoard wb;

    public Student(String name, whiteBoard w) {
        this.name = name;
        wb = w;
    }

    public void run() {
        String text;
        wb.attendance();

        do {
            text = wb.read();
            System.out.println(name + " reading " + text);
            System.out.flush();
        } while (!text.equals("End"));
    }

}

public class InterThreadChallenge {

    public static void main(String[] args) {

        whiteBoard wb = new whiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("John", wb);
        Student s2 = new Student("Roy", wb);

        t.start();

        s1.start();
        s2.start();

    }
}