package lab7.ex5;

public class EmployeeDetails implements Account {
    private String creditsCard, idAccount;
    private double balance;

    public EmployeeDetails(String creditsCard, String idAccount, double balance) {
        this.creditsCard = creditsCard;
        this.idAccount = idAccount;
        this.balance = balance;
    }

    @Override
    public String getCreditsCard() {
        return creditsCard;
    }

    @Override
    public String getIDNum() {
        return idAccount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setCreditsCard(String creditsCard) {
        this.creditsCard = creditsCard;
    }

    @Override
    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "EmployeeDetails [balance=" + balance + ", creditsCard=" + creditsCard + ", idAccount=" + idAccount
                + "]";
    }

}
