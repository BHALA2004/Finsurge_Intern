package Day10.personalLoan;

import java.util.Scanner;

public class PersonDetails{
    Scanner scanner = new Scanner(System.in);
    private static int id = 0;
    private int personId;
    private String personName;
    private int personAge;
    private static long personIncomeparent;

    LoanDetails loanDetails;

    public PersonDetails() {
    }

    public PersonDetails(String personName, int personAge, long personIncomeparent, LoanDetails loanDetails) {
        this.personId = ++id;
        this.personName = personName;
        this.personAge = personAge;
        this.personIncomeparent = personIncomeparent;
        this.loanDetails = loanDetails != null ? loanDetails : new LoanDetails();
    }


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public static long getPersonIncomeparent() {
        return personIncomeparent;
    }

    public static void setPersonIncomeparent(long personIncome) {
        personIncomeparent = personIncome;
    }

    public LoanDetails getLoanDetails() {
        return loanDetails;
    }

    public void setLoanDetails(LoanDetails loanDetails) {
        this.loanDetails = loanDetails;
    }


    public PersonDetails getDetails(){
        System.out.println("Enter Person Name:");
        String personName;
        while (true){
            personName = scanner.nextLine();
            if(Validation.validatePersonName(personName)){
                setPersonName(personName);
                break;
            }
            else {
                System.out.println("Invalid,Enter Valid:");
            }
        }

        System.out.println("Enter Person Age:");
        int personAge;
        while (true){
            try {
                personAge = scanner.nextInt();
                if(personAge>=18 && personAge<=60){
                    setPersonAge(personAge);
                    break;
                }
                else {
                    System.out.println("Loan not provided!");
                }
            }
            catch (Exception e){
                System.out.println("Invalid,Enter Valid:");
            }
        }

        System.out.println("Enter Person Income:");
        long personIncome ;
        while (true){
            try {
                personIncome = scanner.nextLong();
                if(personIncome>9999) {
                    if (calculateSuggestedLoan(personIncome) != 0) {
                        setPersonIncomeparent(personIncome);
                        System.out.println("Loan Sanctioned to around range of ₹" + calculateSuggestedLoan(personIncome));
                        break;
                    } else {
                        System.out.println("Loan Not Provided Income Low");
                    }
                }
                else {
                    System.out.println("Income Too Low!");
                }
            }
            catch (Exception e){
                System.out.println("Invalid,Enter Valid:");
            }
        }

        if (loanDetails == null) {
            loanDetails = new LoanDetails();
        }


        LoanDetails loanDetails1 = loanDetails.getDetails();
        setLoanDetails(loanDetails1);
        return new PersonDetails(this.personName,this.personAge,this.personIncomeparent,this.loanDetails);


    }

    public static double calculateSuggestedLoan(double income) {
        double loanAmount = 0;

        if (income >= 10000 && income <= 20000) {
            loanAmount = income * 20; // Loan = 20 times income
        } else if (income > 20000 && income <= 40000) {
            loanAmount = income * 25; // Loan = 25 times income
        } else if (income > 40000 && income <= 60000) {
            loanAmount = income * 30; // Loan = 30 times income
        } else if (income > 60000 && income <= 80000) {
            loanAmount = income * 35; // Loan = 35 times income
        }
        else {
            loanAmount = 4000000;
        }

        return loanAmount;
    }

    public static void print(PersonDetails personDetails){
        System.out.println("------------------------------");
        System.out.printf("%-20s: %s\n", "Person ID", personDetails.personId);
        System.out.printf("%-20s: %s\n", "Person Name", personDetails.personName);
        System.out.printf("%-20s: %d\n", "Person Age", personDetails.personAge);
        System.out.printf("%-20s: %c%d\n", "Person Income", '₹',personDetails.personIncomeparent);
        System.out.printf("%-20s: %s\n", "Loan ID", personDetails.loanDetails.getLoanId());
        System.out.printf("%-20s: %c%d\n", "Loan Amount", '₹',personDetails.loanDetails.getPersonLoanAmount());
        System.out.printf("%-20s: %d%c\n", "Interest Percent", personDetails.loanDetails.getInterestPercent(),'%');
        System.out.printf("%-20s: %d%s\n", "Interest Years", personDetails.loanDetails.getInterestForYears(),"yrs");
        System.out.printf("%-20s: %c%.2f\n", "Interest Per Month", '₹',personDetails.loanDetails.getPersonIntersetPerMonth());
        System.out.printf("%-20s: %c%.2f\n", "Interest Per Year",'₹', personDetails.loanDetails.getPersonInterestperYear());
        System.out.printf("%-20s: %c%d\n", "Final Amount", '₹',personDetails.loanDetails.getFinalAmount());
        System.out.printf("%-20s: %d\n", "Bank ID", personDetails.loanDetails.getBankId());
        System.out.println("Thank You!");
        System.out.println("------------------------------------");

    }
}
