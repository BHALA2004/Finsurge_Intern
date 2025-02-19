package Day10.personalLoan;

import java.util.ArrayList;

public class LoanDetails extends PersonDetails{

    private static int id = 0;
    private int loanId;
    private long personLoanAmount;
    private int interestPercent;
    private int interestForYears;
    private float personIntersetPerMonth;
    private float personInterestperYear;
    private long finalAmount;

    private int bankId;


    private static ArrayList<BankDetails> bankDetails = new ArrayList<>();

    public static void setBankList(ArrayList<BankDetails> banks) {
        bankDetails = banks;
    }


    public LoanDetails() {
    }

    public LoanDetails(long personLoanAmount, int interestPercent, int interestForYears,float personIntersetPerMonth,float personInterest, long finalAmount, int bankId) {
        this.loanId = ++id;
        this.personLoanAmount = personLoanAmount;
        this.interestPercent = interestPercent;
        this.interestForYears = interestForYears;
        this.personIntersetPerMonth=personIntersetPerMonth;
        this.personInterestperYear = personInterest;
        this.finalAmount = finalAmount;
        this.bankId = bankId;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public long getPersonLoanAmount() {
        return personLoanAmount;
    }

    public void setPersonLoanAmount(long personLoanAmount) {
        this.personLoanAmount = personLoanAmount;
    }

    public int getInterestPercent() {
        return interestPercent;
    }

    public void setInterestPercent(int interestPercent) {
        this.interestPercent = interestPercent;
    }

    public int getInterestForYears() {
        return interestForYears;
    }

    public void setInterestForYears(int interestForYears) {
        this.interestForYears = interestForYears;
    }

    public float getPersonIntersetPerMonth() {
        return personIntersetPerMonth;
    }

    public void setPersonIntersetPerMonth(float personIntersetPerMonth) {
        this.personIntersetPerMonth = personIntersetPerMonth;
    }

    public float getPersonInterestperYear() {
        return personInterestperYear;
    }

    public void setPersonInterestperYear(float personInterest) {
        this.personInterestperYear = personInterest;
    }

    public long getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(long finalAmount) {
        this.finalAmount = finalAmount;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Override
    public LoanDetails getDetails(){
        System.out.println("Enter Loan Amount:");
        long loanAmount;
        while (true) {
            if (scanner.hasNextLong()) {
                loanAmount = scanner.nextLong();
                double income = PersonDetails.getPersonIncomeparent();
                double tempLoan = PersonDetails.calculateSuggestedLoan(income);
                if (loanAmount <= tempLoan) {
                    setPersonLoanAmount(loanAmount);
                    break;
                } else {
                    System.out.println("Loan Amount too high,Not Possible");
                }
//               setPersonLoanAmount(loanAmount);
            } else {
                System.out.println("Invalid, Enter Valid Loan Amount:");
                scanner.next(); // Consume the invalid input
            }
        }
        scanner.nextLine();
        System.out.printf("%-10s %s%n","S.no","Bank Name","Intrest%");
        for (int i = 0; i < bankDetails.size(); i++) {
            System.out.printf("%-10s %s%n", (i + 1) + ".", bankDetails.get(i).getBankName() + " - " + bankDetails.get(i).getAnnualPercentIncome()+"%");
        }

        System.out.println("Enter which Bank do you want to get Loan:");
        String bankName;
        int bankId;
        int bankPercent;
        while (true){
            bankName = scanner.nextLine();
            if(Validation.validateBankName(bankName) && Validation.findBank(bankDetails,bankName)){
                BankDetails bankObject=Validation.findBankObject(bankDetails,bankName);
                bankId=bankObject.getBankId();
                bankPercent=bankObject.getAnnualPercentIncome();
                break;
            }
            else {
                System.out.println("Invalid,Enter Valid:");
            }
        }
        setInterestPercent(bankPercent);

        System.out.println("Enter years to calculate Interest:");
        int years ;
        while (true){
            try {
                years = scanner.nextInt();
                if(years>=1 && years<=7){
                    setInterestForYears(years);
                    break;
                }
                else {
                    System.out.println("Loan Not Possible");
                }
            }
            catch (Exception e){
                System.out.println("Invalid,Enter Valid:");
            }
        }

        int months = Validation.yearsIntoMonts(years);
        float rateOfInterest = Validation.rateIntoYears(bankPercent);
        float interestCalculatePerMonth = Validation.calculateInterest(loanAmount,rateOfInterest,months);
        setPersonIntersetPerMonth(interestCalculatePerMonth);
        float interestCalculatePerYear = interestCalculatePerMonth*years;
        setPersonInterestperYear(interestCalculatePerYear);

        long finalAmount =(long) ((interestCalculatePerYear*years)+loanAmount);
        setFinalAmount(finalAmount);

        return new LoanDetails(this.personLoanAmount,this.interestPercent,this.interestForYears,this.personIntersetPerMonth,this.personInterestperYear,this.finalAmount,bankId);

    }
}
