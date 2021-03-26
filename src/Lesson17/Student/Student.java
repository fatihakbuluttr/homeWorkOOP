package Lesson17.Student;

public class Student {

    String name;
    int roll_no;
  String phone;
    String adress;

    public Student(String name, int roll_no, String  phone, String adress) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone = phone;
        this.adress = adress;
    }

    public static void print (String name){
        System.out.println(name);
    }



    public String getRoll_no() {
        return String.valueOf(roll_no);
    }

    public String  getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }
}
