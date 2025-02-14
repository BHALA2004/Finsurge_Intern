package Day7.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    static int studentId = 0;

    int id;
    public String studentName;
    public Long rollNumber;
    public List<Float> studentMarkList;

    public float percentage ;


    public Student() {
    }

    public Student(String studentName, Long rollNumber, List<Float> studentMarkList, float percentage) {
        this.id = ++studentId;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.studentMarkList = studentMarkList;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<Float> getStudentMarkList() {
        return studentMarkList;
    }

    public void setStudentMarkList(List<Float> studentMarkList) {
        this.studentMarkList = studentMarkList;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                ", studentMarkList=" + studentMarkList +
                ", percentage=" + percentage +
                '}';
    }

    public Student getStudentDetails(){

        System.out.println("Enter Student Details");
        System.out.println("Enter Student Name:");
        String studentName ;
        while (true) {
            studentName = scanner.nextLine(); // Trim spaces
            if (Validate.validateStudentName(studentName)) {
                setStudentName(studentName);
                break;
            } else {
                System.out.println("Invalid, Enter Valid Name:");
            }
        }

        System.out.println("Enter Student Roll No:");
        Long tempStudentNo;
        while (true){
            try {
                tempStudentNo = Long.parseLong(scanner.nextLine());
                setRollNumber(tempStudentNo);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid,Enter Valid:");
            }
        }
        float totalMarks = 500.0f;
        float avg = 0;
        List<Float> studentMarkList = new ArrayList<>();
        for (int i = 1;i<=5;i++){
            System.out.printf("Enter mark %d:",i);
            String mark ;
            Float tempMark;
            while (true) {
                try {
                    tempMark = Float.parseFloat(scanner.nextLine().trim());
                    if (tempMark < 0 || tempMark> 100) { // Validate mark range
                        System.out.println("Invalid, marks should be between 0 and 100:");
                        continue;
                    }
                    studentMarkList.add(tempMark);
                    avg += tempMark;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid, Enter a valid number:");
                }
            }

        }
        this.studentMarkList=studentMarkList;
        this.percentage = (avg/totalMarks)*100;


        return new Student(this.studentName,this.rollNumber,this.studentMarkList,this.percentage);

    }

}
