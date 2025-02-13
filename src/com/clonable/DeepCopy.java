package com.clonable;
class Student implements Cloneable{
    int id;
    StudentPhone studentPhone;

    public Student(int id,String phone) {
        this.id=id;
        this.studentPhone = new StudentPhone(phone);
    }

    public Object clone() throws CloneNotSupportedException{
        Student s1 = (Student) super.clone();
        s1.studentPhone=(StudentPhone) this.studentPhone.clone();
        return s1;
    }
}

class StudentPhone implements Cloneable{
    String phoneNumber;

    public StudentPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Object clone() throws CloneNotSupportedException{
      return new StudentPhone(this.phoneNumber);
    }
}

public class DeepCopy{
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student(1,"312562464");
        Student s1 = (Student) s.clone();

        s1.studentPhone.phoneNumber="743876528739467";
        System.out.println(s.studentPhone.phoneNumber);
        System.out.println(s1.studentPhone.phoneNumber);


    }
}
