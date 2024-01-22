/**
 * @author Soumya Ranjan Panda
 * @version 1.0
 * @since 2003
 */
package javadocDemo;
 
/**
 * @author Soumya Ranjan Panda
 * Class for Library Book
 */
public class book {

    /**
     * @value default value 20
     */
    static int val=20;

    /**
     * Parameterized Constructor
     * @param s  Book Name
     */
    public book(String s){
    }
  
    /**
     * Issue a Book to a Student
     * @param roll  Rool Number of a Student
     * @throws Exception  Throws Exception if Book not Available
     */
    public void issue(int roll) throws Exception{
    }

    /**
     * Checks if Book is Available
     * @param n  Book Name
     * @return  if book is availabe returns true else false
     */

    public boolean available(String n){
        return true;
    }
  
    /**
     * Get Book Name     //<--this line is for description;
     * @param id  Book Id
     * @return  returns Book Name
     */
    public String getname(int id){
        return "";
    }

}
