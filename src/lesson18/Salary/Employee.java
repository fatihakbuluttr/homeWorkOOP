package lesson18.Salary;

public class Employee extends Member{

    private String specialization;

    public Employee(String name, int age, int phoneNumber,
                    String address, int salary,String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization=specialization;
    }
}
