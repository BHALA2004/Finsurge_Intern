package com.student;

import java.util.List;

public class StudentDetails {
    private int studentId;
    private String studentName;
    private List<Float> studentMarksList;
    private float averageOfStudent;
    private int totalMarks;
    private char studentGrade;

    public StudentDetails(int studentId, String studentName, List<Float> studentMarksList, float averageOfStudent, int totalMarks, char studentGrade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMarksList = studentMarksList;
        this.averageOfStudent = averageOfStudent;
        this.totalMarks = totalMarks;
        this.studentGrade = studentGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Float> getStudentMarksList() {
        return studentMarksList;
    }

    public float getAverageOfStudent() {
        return averageOfStudent;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentMarksList(List<Float> studentMarksList) {
        this.studentMarksList = studentMarksList;
    }

    public void setAverageOfStudent(float averageOfStudent) {
        this.averageOfStudent = averageOfStudent;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setStudentGrade(char studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarksList=" + studentMarksList +
                ", averageOfStudent=" + averageOfStudent +
                ", totalMarks=" + totalMarks +
                ", studentGrade=" + studentGrade +
                '}';
    }
}
