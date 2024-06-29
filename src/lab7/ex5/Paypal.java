package lab7.ex5;

import more_lab9_2.Employee;

public class Paypal implements PaymentGateway {
    TransactionDetails listTransactions;
    public static double PAYPAL_FEE = 0.02;

    public Paypal(TransactionDetails listTransactions) {
        this.listTransactions = listTransactions;
        init();
    }

    void init() {
        listTransactions.addTransaction("54354", new EmployeeDetails("54636456", "543df343", 556443.45));
        listTransactions.addTransaction("64fd43", new EmployeeDetails("123456789", "64fd43", 1000));
        listTransactions.addTransaction("64fd44", new EmployeeDetails("123453465", "64fd44", 1664753.4));
        listTransactions.addTransaction("64fd45", new EmployeeDetails("123456735", "64fd45", 766456.4));
        listTransactions.addTransaction("54363fr", new PropertyDetails("5458958324524", "76gf34", 7054356453.45));
    }

    @Override
    public void makePayment(String creditCardNumber, double amount) {
        listTransactions.payment(creditCardNumber, amount, PAYPAL_FEE);
    }

    @Override
    public void refundPayment(String transactionId, double amount) {
        listTransactions.refund(transactionId, amount);
    }

    @Override
    public void voidPayment(String transactionId) {
        listTransactions.voidTransaction(transactionId);
    }

    @Override
    public TransactionDetails getTransactionDetails(String transactionId) {
        return listTransactions.getTransactionDetails(transactionId);
    }

}
