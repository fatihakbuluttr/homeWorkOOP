package Lesson17.Student;

public class Main {
    public static void main(String[] args) {

        Student s1=new Student("ali",12,"2342324","van");
        //Student s2=new Student("veli",12,2342324,"kayseri");
        //Student s3=new Student("mehmet",12,2342324,"kayseri");

        Student.print(s1.phone);
        Student.print(s1.getAdress());
        Student.print(s1.getRoll_no());
        Student.print(s1.name);





    }
}
