package org.khnure.optional.lect16spring;

public class MockedPaymentSystem implements PaymentSystem{

    public boolean acceptPayment(int sum) {
        // just a stub
        return true;
    }
}
