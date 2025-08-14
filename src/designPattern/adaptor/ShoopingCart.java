package designPattern.adaptor;

public class ShoopingCart {

    private PaymentGateway paymentGateway;

    public ShoopingCart(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount){
        paymentGateway.pay(amount);
    }
}
