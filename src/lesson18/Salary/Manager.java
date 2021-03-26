package lesson18.Salary;

public class Manager extends Member {
private String departmant;

    public Manager(String name, int age, int phoneNumber,
                   String address, int salary,String departmant) {
        super(name, age, phoneNumber, address, salary);
        this.departmant=departmant;
    }
}
