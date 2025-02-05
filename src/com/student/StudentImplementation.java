package com.student;

import java.util.List;

public class StudentImplementation {

    //Grade Calculation is done
    public char calculateGrade(int totalMarks){
        if (totalMarks >= 0 && totalMarks <= 50) {
            return 'F';
        } else if (totalMarks <= 100) {
            return 'E';
        } else if (totalMarks <= 200) {
            return 'D';
        } else if (totalMarks <= 300) {
            return 'C';
        } else if (totalMarks <= 400) {
            return 'B';
        } else if (totalMarks <= 500) {
            return 'A';
        }
        return '0';
    }

    //Print in Table formats
    public void printStudentDetails(List<StudentDetails> studentDetailsList){
        System.out.printf("%-17s%-32s%-10s%-10s%-10s%-10s%-10s%-24s%-22s%-17s%n",
                "Student Id", "Student name", "Mark 1", "Mark 2", "Mark 3", "Mark 4", "Mark 5",
                "Student Average Mark", "Student Total Mark", "Student Grade");

        for (StudentDetails studentDetails : studentDetailsList) {
            System.out.printf("%-17s", studentDetails.getStudentId());

            if (studentDetails.getStudentName().length() <= 31) {
                System.out.printf("%-31s", studentDetails.getStudentName());
            } else {
                int m = studentDetails.getStudentName().length();
                int initialHold = 0;
                int holdValue = 32;

                while (m > 32) {
                    System.out.printf("%-32s", studentDetails.getStudentName().substring(initialHold, holdValue));
                    initialHold = holdValue;
                    holdValue += 32;
                    System.out.println();
                    m -= 32;
                    System.out.print(String.format("%-17s",""));
                }
                if(m>0){
                    System.out.printf("%-32s",studentDetails.getStudentName().substring(initialHold,studentDetails.getStudentName().length()));
                }

            }

            for (float studentMark : studentDetails.getStudentMarksList()) {
                System.out.printf("%-10.2f", studentMark);
            }

            System.out.printf("%-24.2f%-22d%-17s%n",
                    studentDetails.getAverageOfStudent(),
                    studentDetails.getTotalMarks(),
                    studentDetails.getStudentGrade());
        }




    }

}
