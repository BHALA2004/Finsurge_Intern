package day11.educationalloan;

public class BankDetails {

    private static int id = 0;
    private int bankId;
    private String bankName;
    private int annualPercentIncome;

    public BankDetails() {
    }

    public BankDetails(String bankName, int annualPercentIncome) {
        this.bankId = ++id;
        this.bankName = bankName;
        this.annualPercentIncome = annualPercentIncome;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAnnualPercentIncome() {
        return annualPercentIncome;
    }

    public void setAnnualPercentIncome(int annualPercentIncome) {
        this.annualPercentIncome = annualPercentIncome;
    }
}
