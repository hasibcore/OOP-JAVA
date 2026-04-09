
package aust.studentmanagement;
public class InvalidIdException extends Exception {
    public InvalidIdException() {
        super("Invalid");
    }

    public InvalidIdException(String name) {
        super("Invalid : "+name);
    }
    
    
}
