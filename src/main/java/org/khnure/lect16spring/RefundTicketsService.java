package org.khnure.lect16spring;


import java.time.LocalDateTime;

//a lot of services
public class RefundTicketsService {

    private PaymentSystem paymentSystem;
    ///a lot dependencies

    public RefundTicketsService(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void bookTickets(int sum, LocalDateTime localDateTime) {
        //pro-booking for a date
        paymentSystem.acceptPayment(sum);
    }

}
