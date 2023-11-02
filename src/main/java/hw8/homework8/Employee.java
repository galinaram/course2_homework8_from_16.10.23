package hw8.homework8;
public class Employee {
    private String firstName;
    private String secondName;
    public String getFullName() {return firstName + " " + secondName;}



    public Employee(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public Employee(Employee employee) {
        this.firstName = employee.firstName;
        this.secondName = employee.secondName;
    }

    public  String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String toString() {
        return "ФИО: " + getFirstName() + " " + getSecondName();
    }

}


