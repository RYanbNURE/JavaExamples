package org.khnure.lect16spring;

public class Main {
    public static void main(String[] args) {

        //testing level 0
        new BookingTicketsService(new MockedPaymentSystem()); //Spanish dependencies
        new RedeemTicketsService(new MockedPaymentSystem());
        new RefundTicketsService(new MockedPaymentSystem());

        //production
        new BookingTicketsService(new RealPaymentSystem()); //Pogtugees  dependencies
        new RedeemTicketsService(new RealPaymentSystem());
        new RefundTicketsService(new RealPaymentSystem());

    }
}
