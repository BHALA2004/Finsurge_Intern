package Day10.personalLoan;

public class BankDetails {

    private static int id = 0;
    private int bankId;
    private String bankName;
    private String bankLocation;
    private int annualPercentIncome;

    public BankDetails(String bankName, String bankLocation, int annualPercentIncome) {
        this.bankId = ++id;
        this.bankName = bankName;
        this.bankLocation = bankLocation;
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

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public int getAnnualPercentIncome() {
        return annualPercentIncome;
    }

    public void setAnnualPercentIncome(int annualPercentIncome) {
        this.annualPercentIncome = annualPercentIncome;
    }
}
