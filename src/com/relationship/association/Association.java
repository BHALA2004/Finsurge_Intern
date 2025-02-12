package com.relationship.association;

import java.util.ArrayList;
import java.util.List;

public class Association {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        Teacher t1 = new Teacher(1,"Mala");
        Teacher t2 = new Teacher(2,"Vishnu");
        Teacher t3 = new Teacher(1,"Thara");
        teacherList.add(t1);teacherList.add(t2);
        teacherList.add(t3);
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1,"Bala");
        Student s2 = new Student(2,"Karthick");
        Student s3 = new Student(1,"Venugopal");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        for (Teacher t : teacherList){
            System.out.println(t.toString());
        }

        for (Student s : studentList){
            System.out.println(s.toString());
        }






    }
}
class Teacher{
    int teacherId;
    String teacherName;

    public Teacher(int teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
