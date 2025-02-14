package Day7.task;

import java.util.Scanner;

public class College implements Cloneable{
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

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        System.out.println("Enter College Name:");
        String collegeName;
        while (true){
            collegeName=scanner.nextLine();
            if(Validate.validateCollegeName(collegeName)){
                setCollegeName(collegeName);
                break;
            }
            else {
                System.out.println("Invalid!,Enter Valid:");
            }
        }
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

    public static void printCollegeandStudentDetails(College collegeDetails) {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("College Details:");
        System.out.println("College Id       : " + collegeDetails.id);
        System.out.println("College Name     : " + collegeDetails.collegeName);
        System.out.println("College Code     : " + collegeDetails.collegeCode);
        System.out.println("College Location : " + collegeDetails.collegeLocation);
        System.out.println("\nStudent Details:");
        System.out.println("Student Id       : " + collegeDetails.student.id);
        System.out.println("Student Name     : " + collegeDetails.student.studentName);
        System.out.println("Student Roll No  : " + collegeDetails.student.rollNumber);
        System.out.println("\nStudent Marks:");
        System.out.println("Mark 1          : " + collegeDetails.student.studentMarkList.get(0));
        System.out.println("Mark 2          : " + collegeDetails.student.studentMarkList.get(1));
        System.out.println("Mark 3          : " + collegeDetails.student.studentMarkList.get(2));
        System.out.println("Mark 4          : " + collegeDetails.student.studentMarkList.get(3));
        System.out.println("Mark 5          : " + collegeDetails.student.studentMarkList.get(4));
        System.out.println("\nPercentage      : " + collegeDetails.student.percentage);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        College college = (College) super.clone();
        college.student = (Student)this.student.clone();
        return college;
    }

}
