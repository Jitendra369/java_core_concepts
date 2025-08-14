package designPattern.adaptor.adaptors;

import designPattern.adaptor.PaymentGateway;
import designPattern.adaptor.PhonePayAPI;

public class PhonePayAdaptor implements PaymentGateway {

    private PhonePayAPI phonePayAPI = null;

    public PhonePayAdaptor(){
        this.phonePayAPI = new PhonePayAPI();
    }

    @Override
    public void pay(double amount) {
        phonePayAPI.UPIPay(amount);
    }
}
