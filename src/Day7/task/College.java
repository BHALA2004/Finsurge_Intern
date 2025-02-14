package Day7.task;

import java.util.Scanner;

public class College {
    Scanner scanner = new Scanner(System.in);
    static int collgeId = 0;
    int id;
    String collegeName ;
    int collegeCode;
    String collegeLocation;

    public Student student;

    public College() {
    }

    public College(String collegeName, int collegeCode, String collegeLocation, Student student) {
        this.id = ++collgeId;
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
        this.collegeLocation = collegeLocation;
        this.student = student;
    }



    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(int collegeCode) {
        this.collegeCode = collegeCode;
    }

    public String getCollegeLocation() {
        return collegeLocation;
    }

    public void setCollegeLocation(String collegeLocation) {
        this.collegeLocation = collegeLocation;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", collegeName='" + collegeName + '\'' +
                ", collegeCode=" + collegeCode +
                ", collegeLocation='" + collegeLocation + '\'' +
                ", student=" + student.toString()+
                '}';
    }

    public College getCollegeDetails(){
        System.out.println("Enter College Details");
        System.out.println("Enter College Name:");
        String collegeName;
        while (true){
            collegeName=scanner.next();
            if(Validate.validateCollegeName(collegeName)){
                setCollegeName(collegeName);
                break;
            }
            else {
                System.out.println("Invalid!,Enter Valid:");
            }
        }
        scanner.nextLine();
        System.out.println("Enter College code:");
        String tempcollegeCode;
        int collegeCode=0;
        while (true){
            tempcollegeCode=scanner.next();
            if(Validate.validateCollegeCode(tempcollegeCode)){
                collegeCode =Integer.parseInt(tempcollegeCode);
                setCollegeCode(collegeCode);
                break;
            }
            else {
                System.out.println("Invalid,Enter Valid:");
            }
        }

        System.out.println("Enter College Location:");
        String collegeLocation;
        while (true){
            collegeLocation=scanner.next();
            if(Validate.validateCollegeLocation(collegeLocation)){
                setCollegeLocation(collegeLocation);
                break;
            }
            else {
                System.out.println("Invalid!,Enter Valid");
            }
        }
        Student student1 = new Student();
        Student studentDetails = student1.getStudentDetails(); // Get student details properly
        this.student = studentDetails;
        return new College(this.collegeName,this.collegeCode,this.collegeLocation,this.student);

    }
}
