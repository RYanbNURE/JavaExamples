package org.khnure.oprional.lect16spring;

public class MockedPaymentSystem implements PaymentSystem{

    public boolean acceptPayment(int sum) {
        // just a stub
        return true;
    }
}
