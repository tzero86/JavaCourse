package chapter9;

public class Employee extends Person{
    private String employeeId;
    private String employeeTitle;

    public Employee(){
        super("Elias");
        System.out.println("In Employee default constructor");
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }
}
