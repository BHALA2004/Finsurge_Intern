package com.student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<StudentDetails> studentDetailsList = new ArrayList<>();
        StudentImplementation studentImplementation = new StudentImplementation();
        System.out.print("Total Number of Students:");
        int totalNumberOfStudents;
        //Validation for getting correct input
        while (true) {
            try {
                totalNumberOfStudents = Integer.parseInt(scanner.nextLine());
                if(totalNumberOfStudents>=1 && totalNumberOfStudents<=10){
                    break;
                } else{
                    System.out.print("Invalid input,Enter Valid input:");
                }

            } catch (NumberFormatException e) {
                System.out.print("Invalid input,Enter Valid input:");
            }
        }


        int totalSubjects = 5;

        //For Each Student - > each subjects,Marks,Average,Total Marks,Grade is calculated
        for (int i = 1; i<= totalNumberOfStudents; i++){
            String studentName;
            while (true) {
                System.out.printf("Enter Student Name %d: ", i);
                studentName = scanner.nextLine();
                //Validating the name contains only characters
                if (studentName.matches("^[A-Z][a-z]+( | [A-Z]|[A-Z][a-z]+)*")) {
                    break;
                } else {
                    System.out.println("Invalid Input");
                }
            }
            List<Float> studentMarkList = new ArrayList<>();
            int studentTotalMarks = 0;
            float studentAverageMarks = 0;
            for (int j = 1;j<=totalSubjects;j++){
                float subjectMark;
                while (true){
                    try {

                        //Get Subject mark and it should be integer
                        System.out.printf("Enter Subject mark %d:",j);
                        subjectMark=Float.parseFloat(scanner.nextLine().trim());

                        //Also satisfy it is less than or equal to 100 and Greater than or equal to 0
                        if(subjectMark>=0 && subjectMark<=100){
                            break;
                        }else {
                            System.out.print("Marks Greater than 0 and less than 100 ");
                        }
                    }
                    catch (Exception e){
                        System.out.print("Invalid Input!");
                    }
                }

                studentMarkList.add(subjectMark);

                //Total Marks Calculation
                studentTotalMarks+=(int)subjectMark;

                //Average Marks Calculation
                studentAverageMarks=(float)studentTotalMarks/totalSubjects;
            }
            char studentGrade = studentImplementation.calculateGrade(studentTotalMarks);
            //Creating Each student Objects and add it in Student Details List
            StudentDetails studentDetails = new StudentDetails(i,studentName,studentMarkList,studentAverageMarks,studentTotalMarks,studentGrade);
            studentDetailsList.add(studentDetails);
          }
        //Printing as Tables
        studentImplementation.printStudentDetails(studentDetailsList);
    }
}
