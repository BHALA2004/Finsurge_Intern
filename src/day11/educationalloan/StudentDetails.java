package day11.educationalloan;

public class StudentDetails {
    private static int id = 0;
    private int studentId;
    private String studentName;
    private String studentCourseName;
    private long loanAmount;
    private float interestPercent;
    private int loanYears;
    private float interestPerMonth;
    private float interestPerYear;
    private float finalAmount;
    private int bankId;

    public StudentDetails() {
    }

    public StudentDetails(String studentName, String studentCourseName, long loanAmount, float interestPercent, int loanYears, float interestPerMonth, float interestPerYear, float finalAmount, int bankId) {
        this.studentId = ++id;
        this.studentName = studentName;
        this.studentCourseName = studentCourseName;
        this.loanAmount = loanAmount;
        this.interestPercent = interestPercent;
        this.loanYears = loanYears;
        this.interestPerMonth = interestPerMonth;
        this.interestPerYear = interestPerYear;
        this.finalAmount = finalAmount;
        this.bankId = bankId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourseName() {
        return studentCourseName;
    }

    public void setStudentCourseName(String studentCourseName) {
        this.studentCourseName = studentCourseName;
    }

    public long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public float getInterestPercent() {
        return interestPercent;
    }

    public void setInterestPercent(float interestPercent) {
        this.interestPercent = interestPercent;
    }

    public int getLoanYears() {
        return loanYears;
    }

    public void setLoanYears(int loanYears) {
        this.loanYears = loanYears;
    }

    public float getInterestPerMonth() {
        return interestPerMonth;
    }

    public void setInterestPerMonth(float interestPerMonth) {
        this.interestPerMonth = interestPerMonth;
    }

    public float getInterestPerYear() {
        return interestPerYear;
    }

    public void setInterestPerYear(float interestPerYear) {
        this.interestPerYear = interestPerYear;
    }

    public float getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(float finalAmount) {
        this.finalAmount = finalAmount;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }
}
