package lesson18.FazlaMesai;

import lesson18.FazlaMesai.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employeeArda=new Employee(400,7);

        employeeArda.addSalary();
        employeeArda.addWork();

        System.out.println("Arda's final salary: "+employeeArda.getSalary());
    }
}
