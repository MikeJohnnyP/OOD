package lab7.ex5;

public class Main {
  public static void main(String[] args) {
    PaymentGateway p1 = new Paypal(new BankList("OCB", "64fd43"));

    p1.makePayment("123456789", 1000);
    p1.refundPayment("64fd43", 1000);
    p1.voidPayment("64fd43");
    p1.getTransactionDetails("64fd43");

    PaymentGateway p2 = new ViettelMoney(new BankList("Vietcombank", "54354"));
    p2.makePayment("63456244", 6553456.432);
    p2.refundPayment("54364dr", 6553456.432);
    p2.voidPayment("54364dr");
    p2.getTransactionDetails("54364dr");

    PaymentGatewayAdapter pAdapter = new PaymentGatewayAdapter(new ViettelMoney(new BankList("Vietcombank", "54354")));
    pAdapter.makePayment("63456244", 6553456.432);
    pAdapter.refundPayment("54364dr", 6553456.432);
    pAdapter.voidPayment("54364dr");
    pAdapter.getTransactionDetails("54364dr");

  }
}
