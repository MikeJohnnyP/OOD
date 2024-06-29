package lab7.ex5;

public class ViettelMoney implements PaymentGateway {
    private TransactionDetails listTransactions;
    public static double VIETTEL_MONEY_FEE = 0.01;

    public ViettelMoney(TransactionDetails listTransactions) {
        this.listTransactions = listTransactions;
        init();
    }

    void init() {
        listTransactions.addTransaction("54354", new EmployeeDetails("54636456", "543df343", 556443.45));
        listTransactions.addTransaction("64fd43", new PropertyDetails("123456789", "64fd43", 1000));
        listTransactions.addTransaction("345df34", new PropertyDetails("123453465", "345df34", 1664753.4));
        listTransactions.addTransaction("54364dr", new PropertyDetails("63456244", "546fdfe3", 6553456.432));
    }

    @Override
    public void makePayment(String creditCardNumber, double amount) {
        listTransactions.payment(creditCardNumber, amount, VIETTEL_MONEY_FEE);
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
