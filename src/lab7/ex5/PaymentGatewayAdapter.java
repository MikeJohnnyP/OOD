package lab7.ex5;

public class PaymentGatewayAdapter implements PaymentGateway {
    private PaymentGateway paymentGateway;

    public PaymentGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String creditCardNumber, double amount) {
        paymentGateway.makePayment(creditCardNumber, amount);
    }

    @Override
    public void refundPayment(String transactionId, double amount) {
        paymentGateway.refundPayment(transactionId, amount);
    }

    @Override
    public void voidPayment(String transactionId) {
        paymentGateway.voidPayment(transactionId);
    }

    @Override
    public TransactionDetails getTransactionDetails(String transactionId) {
        return paymentGateway.getTransactionDetails(transactionId);
    }

}
