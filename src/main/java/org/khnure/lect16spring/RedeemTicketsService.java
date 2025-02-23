package org.khnure.lect16spring;


import java.time.LocalDateTime;

public class RedeemTicketsService {

    private PaymentSystem paymentSystem;

    public RedeemTicketsService(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void bookTickets(int sum, LocalDateTime localDateTime) {
        //pro-booking for a date
        paymentSystem.acceptPayment(sum);
    }

}
