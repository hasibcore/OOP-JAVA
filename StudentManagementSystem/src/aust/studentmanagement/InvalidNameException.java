package aust.studentmanagement;
public class InvalidNameException extends Exception{

    public InvalidNameException() {
        super("Invalid");
    }

    public InvalidNameException(String message) {
        super("Invalid : "+message);
    }
    
}
