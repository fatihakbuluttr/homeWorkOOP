package lesson17Employee;

public class Employee extends Members{

    private String specialization;


    public Employee(String name, int age, int phoneNumber, String address, int salary) {
        super(name, age, phoneNumber, address, salary);
    }

    public Employee() {
        super();
    }
}
