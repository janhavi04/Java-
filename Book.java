/**
 * @author Janhavi J
 * @version 2.0
 * @since 2023
 */


 /** 
  * @author Janhavi

   Class for library book
  */
public class Book {
    /**
     * @value 10 default value
     */
    static int val =10;

    /**
     * Parametrized constructor
     * @param s Book Name
     */
    public Book(String s){

    }
    /**
     * Issue a Book to a Student
     * 
     * @param roll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int roll)throws Exception{}

    /**
     * Check if book is available 
     * @param str Book name
     * @return if book is available returns true else false
     */

    public boolean available(String str){
        return true;
    }

    /**
     * Get book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){
        return "";
    }

    
}