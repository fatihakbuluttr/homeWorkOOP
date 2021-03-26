package lesson18.Salary;

public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee("Ali",49,1234,
                "Paris",2000,"Driver");
        Manager manager=new Manager("fatih",46,4321,
                "Tokyo",5000,"Engineer");

        employee.printSalary();
        manager.printSalary();

    }
}
