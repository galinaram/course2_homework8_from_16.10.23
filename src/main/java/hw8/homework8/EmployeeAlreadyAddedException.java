package hw8.homework8;

public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException (String message) {
        super(message);
    }

}