package lesson18.FazlaMesai;

public class Employee {
    private int salary;
    private int numberOfHours;

    public Employee(int salary, int numberOfHours) {
        this.salary = salary;
        this.numberOfHours = numberOfHours;
    }

    public  void addSalary(){
        if(this.salary<500){
            this.salary=this.salary+this.numberOfHours*10*5*4;
            }
    }

    public void addWork(){
        if(this.numberOfHours>6){
            int fazlaMesai=this.numberOfHours-6;
            this.salary=this.salary+fazlaMesai*5*5*4;
        }
    }

    public int getSalary() {
        return salary;
    }
}
