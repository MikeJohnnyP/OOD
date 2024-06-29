package lab7.ex5;

public interface PaymentGateway {

    void makePayment(String creditCardNumber, double amount);

    void refundPayment(String transactionId, double amount);

    void voidPayment(String transactionId);

    TransactionDetails getTransactionDetails(String transactionId);
}
