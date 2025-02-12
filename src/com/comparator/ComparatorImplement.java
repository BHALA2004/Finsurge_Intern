package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImplement implements Comparator<Students> {
   public int compare(Students s1,Students s2){
       return s1.studentName.compareTo(s2.studentName);
   }
}
class Students{
    String studentName;

    public Students(String studentName) {
        this.studentName = studentName;
    }
}
class Main{
    public static void main(String[] args) {
        Students s1 = new Students("Bala");
        Students s2 = new Students("Danush");
        Students s3 = new Students("Asia");
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        Collections.sort(studentsList, new ComparatorImplement());
        for (Students s  : studentsList){
            System.out.println((s.studentName));
        }
            




    }
}
