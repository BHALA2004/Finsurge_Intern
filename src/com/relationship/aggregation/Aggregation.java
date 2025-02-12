package com.relationship.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {
    public static void main(String[] args) {
        List<Department> departmentList = new ArrayList<>();
        Department department1 = new Department("CSE");
        Department department2 = new Department("ECE");
        Department department3 = new Department("MECH");
        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bala",department1));
        studentList.add(new Student("Rahul",department3));
        studentList.add(new Student("Veno",department2));
        studentList.add(new Student("Chaari",department1));

        Student.print(studentList);
        Student.print(studentList,department1);
    }
}
class Department{
    String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
}
class Student{
    String studentName;
    Department department;

    public Student(String studentName, Department department) {
        this.studentName = studentName;
        this.department = department;
    }

    public static void print(List<Student> studentList){
        for (Student s : studentList){
            System.out.println(s.studentName+" "+s.department.departmentName);
        }
    }

    public static void print(List<Student> studentList,Department department){
        for (Student s : studentList){
            if(s.department.departmentName.equals(department.departmentName)){
                System.out.println(s.studentName);
            }
        }
    }
}
