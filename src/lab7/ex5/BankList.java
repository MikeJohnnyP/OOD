package lab7.ex5;

import java.util.HashMap;
import java.util.Map;

public class BankList implements TransactionDetails {

    private String banksName, bankID;
    private Map<String, Account> transaction;

    public BankList(String banksName, String bankID) {
        this.banksName = banksName;
        this.bankID = bankID;
        transaction = new HashMap<>();
    }

    @Override
    public Map<String, Account> getTransaction(String transactionID) {
        Map<String, Account> result = new HashMap<>();
        if (transaction.containsKey(transactionID)) {
            result.put(transactionID, transaction.get(transactionID));
        }

        return result;
    }

    @Override
    public void addTransaction(String transactionID, Account account) {
        transaction.put(transactionID, account);
    }

    @Override
    public void updateTransaction(String transactionID, Account account) {
        if (transaction.containsKey(transactionID)) {
            transaction.put(transactionID, account);
        }
    }

    @Override
    public String getBanksName() {
        return banksName;
    }

    @Override
    public String getBankID() {
        return bankID;
    }

    @Override
    public boolean payment(String creditsCard, double amount, double dipositAmount) {
        for (Map.Entry<String, Account> entry : transaction.entrySet()) {
            if (entry.getValue().getCreditsCard().equals(creditsCard)) {
                double balance = entry.getValue().getBalance();
                if (balance >= amount) {
                    entry.getValue().setBalance(balance - amount - (amount * dipositAmount));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Map<String, Account> getListTransaction() {
        return transaction;
    }

    @Override
    public boolean refund(String transactionID, double amount) {
        for (Map.Entry<String, Account> entry : transaction.entrySet()) {
            if (entry.getKey().equals(transactionID)) {
                double balance = entry.getValue().getBalance();
                entry.getValue().setBalance(balance + amount);
                return true;
            }
        }
        return false;
    }

    @Override
    public void voidTransaction(String transactionID) {
        String temp = "";
        for (Map.Entry<String, Account> entry : transaction.entrySet()) {
            if (entry.getKey().equals(transactionID)) {
                temp = entry.getKey();
            }
        }
        transaction.remove(temp);
    }

    @Override
    public TransactionDetails getTransactionDetails(String transactionId) {
        TransactionDetails transactionDetails = new BankList(this.getBanksName(), this.getBankID());
        if (transaction.containsKey(transactionId)) {
            transactionDetails.addTransaction(transactionId, transaction.get(transactionId));
        }
        return transactionDetails;
    }

}
