package lesson18.Salary;

public class Member {
    private String name;
    private int age;
    private int phoneNumber;
    private String address;
    private int salary;

    public Member(String name, int age, int phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public void printSalary(){
        System.out.println(this.name+ " Salary: "+this.salary);
    }


}
