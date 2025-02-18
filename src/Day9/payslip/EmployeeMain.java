package Day9.payslip;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        EmployeeDetails e = employeeDetails.getEmployeeDetails();
        employeeDetails.printEmployeeDetails(e);
    }
}
