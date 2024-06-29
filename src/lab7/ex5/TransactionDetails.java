package lab7.ex5;

import java.util.Map;

public interface TransactionDetails {
    public Map<String, Account> getTransaction(String transactionID);

    public void addTransaction(String transactionID, Account account);

    public void updateTransaction(String transactionID, Account account);

    public boolean payment(String creditsCard, double amount, double dipositAmount);

    public boolean refund(String transactionID, double amount);

    public void voidTransaction(String transactionID);

    public String getBanksName();

    public String getBankID();

    public Map<String, Account> getListTransaction();

    public TransactionDetails getTransactionDetails(String transactionId);
}
