package Day9.payslip;

import java.util.Scanner;

public class EmployeeDetails extends EmployeeForm {

    static Scanner scanner = new Scanner(System.in);
    private static int employeeId = 0;

    private int id;
    private String employeeName;

    private String employeeCompanyName;

    private String employeeCompanyAddress;
    private long basicSalary;
    private float hrAllowence;
    private float educationalAllowence;
    private float travelAllowence;
    private float incomeTax;
    private float providentFund;
    private float lossOfPay;
    private float grossPay;
    private float reduction;

    private float actualIncomePerMonth;
    private float actualCTC;

    public EmployeeDetails() {
    }

    public EmployeeDetails(String employeeName, String employeeCompanyName, String employeeCompanyAddress, long basicSalary, float hrAllowence, float educationalAllowence, float travelAllowence, float providentFund, float lossOfPay, float incomeTax, float grossPay, float reduction, float actualIncomePerMonth, float actualCTC) {
        this.id = getEmployeeId();
        this.employeeName = employeeName;
        this.employeeCompanyName = employeeCompanyName;
        this.employeeCompanyAddress = employeeCompanyAddress;
        this.basicSalary = basicSalary;
        this.hrAllowence = hrAllowence;
        this.educationalAllowence = educationalAllowence;
        this.travelAllowence = travelAllowence;
        this.providentFund = providentFund;
        this.lossOfPay = lossOfPay;
        this.incomeTax=incomeTax;
        this.grossPay = grossPay;
        this.reduction = reduction;
        this.actualIncomePerMonth = actualIncomePerMonth;
        this.actualCTC = actualCTC;
    }

    public static int getEmployeeId() {
        return ++employeeId;
    }

    public void setEmployeeId(int id) {
        this.id = id;
    }

    public static String getEmployeeName() {
        System.out.println("Enter Employee Name:");
        String employeeName;
        while (true) {
            employeeName = scanner.nextLine();
            if (Validate.validateEmployeeName(employeeName)) {
                return employeeName;
            } else {
                System.out.println("Invalid ,Enter Valid in format:");
            }
        }
    }


    public static String getEmployeeCompanyName() {
        System.out.println("Enter Company Name:");
        String employeeCompanyName;
        while (true) {
            employeeCompanyName = scanner.nextLine();
            if (Validate.validateEmployeeName(employeeCompanyName)) {
                return employeeCompanyName;
            } else {
                System.out.println("Invalid,Enter Valid:");
            }
        }
    }

    public static String getEmployeeCompanyAddress() {
        System.out.println("Enter Company Location:");
        String employeeCompanyAddress;
        while (true) {
            employeeCompanyAddress = scanner.nextLine();
            if (Validate.validateEmployeeCompanyAddress(employeeCompanyAddress)) {
                return employeeCompanyAddress;
            } else {
                System.out.println("Invalid,Enter Valid:");
            }
        }
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public static long getBasicSalary() {
        System.out.println("Enter Basic Salary:");
        long basicSalary;
        while (true) {
            try {
                basicSalary = scanner.nextLong();
                if (basicSalary > 0) {
                    return basicSalary;
                } else {
                    System.out.println("Invalid,Enter Valid:");
                }
            } catch (Exception e) {
                System.out.println("Invalid,Enter Valid salary:");
            }
        }
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public static float getHrAllowence(long basicSalary) {
        System.out.println("HR Allowence Detection");
        float hrAllowence = 0.0f;
        System.out.println("Resides in Metropolitian{Yes or No}:");
        String check;
        while (true) {
            check = scanner.next();
            if ("Yes".equalsIgnoreCase(check)) {
                hrAllowence = ((5.0f / 100) * basicSalary);
                return hrAllowence;
            } else if ("No".equalsIgnoreCase(check)) {
                hrAllowence = ((4.0f / 100) * basicSalary);
                return hrAllowence;
            } else {
                System.out.println("Invalid,Enter Correct Input:");
            }
        }
    }

    public void setHrAllowence(float hrAllowence) {
        this.hrAllowence = hrAllowence;
    }

    public static float getEducationalAllowence() {
        System.out.println("Enter No of Children for Educational Allowence Details{1,2}:");
        int check;
        while (true) {
            try {
                check = scanner.nextInt();
                if (check == 1) {
                    return 100.00f;
                } else if (check == 2) {
                    return 200.00f;
                } else {
                    System.out.println("Invalid,Enter Valid:");
                }
            } catch (Exception e) {
                System.out.println("Invalid,Enter Valid:");
            }
        }
    }

    public void setEducationalAllowence(float educationalAllowence) {
        this.educationalAllowence = educationalAllowence;
    }

    public static float getTravelAllowence() {
        System.out.println("Enter Travel Allowence:");
        float travelAllowence;
        while (true) {
            try {
                travelAllowence = scanner.nextFloat();
                if (travelAllowence <= 2000) {
                    return travelAllowence;
                } else {
                    System.out.println("Invalid,Enter Valid:");
                }
            } catch (Exception e) {
                System.out.println("Invalid,Enter Valid:");
            }
        }
    }

    public void setTravelAllowence(float travelAllowence) {
        this.travelAllowence = travelAllowence;
    }

    public static float getProvidentFund() {
        System.out.println("Enter Provident fund Amount:");
        float providentFund;
        while (true) {
            try {
                providentFund = scanner.nextFloat();
                if (providentFund <= 3600) {
                    return providentFund;
                }
                else {
                    System.out.println("Invalid,Enter Valid:");
                }
            } catch (Exception e) {
                System.out.println("Invalid,Enter Valid:");
            }
        }

    }

    public void setProvidentFund(float providentFund) {
        this.providentFund = providentFund;
    }

    public static float getLossOfPay() {
        System.out.println("Enter How many Days Leave:");
        int days;
        while (true) {
            try {
                days = scanner.nextInt();
                if (days > 0 && days >= 1 && days <= 2) {
                    return 500.00f;
                } else if (days > 0 && days >= 2 && days <= 5) {
                    return 1000.00f;
                } else if (days > 0 && days >= 5 && days <= 10) {
                    return 1500.00f;
                } else {
                    System.out.println("Invalid,Enter Valid:");
                }
            } catch (Exception e) {
                System.out.println("Invalid,Enter Valid:");
            }
        }

    }

    public void setLossOfPay(float lossOfPay) {
        this.lossOfPay = lossOfPay;
    }

    public static float getGrossPay(long basicSalary , float hrAllowence ,float educationalAllowence ,float travelAllowence,float providentFund,float lossOfPay,float incomeTax) {
        return basicSalary + hrAllowence + educationalAllowence + travelAllowence+providentFund+lossOfPay+incomeTax;
    }

    public void setGrossPay(float grossPay) {
        this.grossPay = grossPay;
    }

    public static float getIncomeTax(long basicSalary){
        return(float) (5.0f / 100) * basicSalary;
    }
    public static float getReduction(float providentFund , float lossOfPay ,float incomeTax) {
        return providentFund + lossOfPay + incomeTax;
    }

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }

    public static float getActualIncomePerMonth(float grossPayNow,float reductionNow) {
        float grossPay = grossPayNow;
        float reduction = reductionNow;
        return grossPay-reduction;
    }

    public void setActualIncomePerMonth(float actualIncomePerMonth) {
        this.actualIncomePerMonth = actualIncomePerMonth;
    }

    public static float getActualCTC(float actualIncome) {
        return actualIncome * 12;
    }

    public void setActualCTC(float actualCTC) {
        this.actualCTC = actualCTC;
    }

    @Override
    public EmployeeDetails getEmployeeDetails(){
        String employeeName = getEmployeeName();
        String employeeCompanyName = getEmployeeCompanyName();
        String employeeCompanyAddress = getEmployeeCompanyAddress();
        long basicSalary = getBasicSalary();
        float hrAllowence = getHrAllowence(basicSalary);
        float educationalAllowence = getEducationalAllowence();
        float travelAllowence = getTravelAllowence();
        float lossOfPay = getLossOfPay();
        float providentFund = getProvidentFund();
        float incomeTax = getIncomeTax(basicSalary);
        float grossPay = getGrossPay(basicSalary,hrAllowence,educationalAllowence,travelAllowence,providentFund,lossOfPay,incomeTax);
        float reduction = getReduction(providentFund,lossOfPay,incomeTax);
        float actualIncome = getActualIncomePerMonth(grossPay,reduction);
        float actualCTC = getActualCTC(actualIncome);
        return new EmployeeDetails(employeeName,employeeCompanyName,employeeCompanyAddress,
                basicSalary,hrAllowence,educationalAllowence,travelAllowence,
                providentFund,lossOfPay,incomeTax,
                grossPay,reduction,
                actualIncome,actualCTC);
    }

    public void printEmployeeDetails(EmployeeDetails employeeDetails){
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s = %d%n", "Employee Id", employeeDetails.id);
        System.out.printf("%-15s = %s%n", "Employee Name", employeeDetails.employeeName);
        System.out.printf("%-15s = %s%n", "Company Name", employeeDetails.employeeCompanyName);
        System.out.printf("%-15s = %s%n", "Company Location", employeeDetails.employeeCompanyAddress);
        System.out.printf("%-15s = %d%n", "Basic Salary", employeeDetails.basicSalary);
        System.out.printf("%-15s = %.2f%n", "HR Allowance", employeeDetails.hrAllowence);
        System.out.printf("%-15s = %.2f%n", "Educational Allowance", employeeDetails.educationalAllowence);
        System.out.printf("%-15s = %.2f%n", "Travel Allowance", employeeDetails.travelAllowence);
        System.out.printf("%-15s = %.2f%n", "Provident Fund", employeeDetails.providentFund);
        System.out.printf("%-15s = %.2f%n", "Loss of Pay", employeeDetails.lossOfPay);
        System.out.printf("%-15s = %.2f%n", "Income Tax", employeeDetails.incomeTax);
        System.out.printf("%-15s = %.2f%n", "Gross Pay", employeeDetails.grossPay);
        System.out.printf("%-15s = %.2f%n", "Total Deductions", employeeDetails.reduction);
        System.out.printf("%-15s = %.2f%n", "Net Salary", employeeDetails.actualIncomePerMonth);
        System.out.printf("%-15s = %.2f%n", "Actual CTC", employeeDetails.actualCTC);
        System.out.println("-------------------------------------------------");



    }

}



