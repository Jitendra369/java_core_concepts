package designPattern.adaptor.adaptors;

import designPattern.adaptor.PaymentGateway;
import designPattern.adaptor.RazorPayAPI;

public class RozerPayAdaptor implements PaymentGateway {

    public RazorPayAPI razorPayAPI;

    public RozerPayAdaptor(){
        razorPayAPI = new RazorPayAPI();
    }

    @Override
    public void pay(double amount) {
        razorPayAPI.makePayment(amount);
    }
}
