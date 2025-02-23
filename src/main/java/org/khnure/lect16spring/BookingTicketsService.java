package org.khnure.lect16spring;


import java.time.LocalDateTime;

public class BookingTicketsService {

    private PaymentSystem paymentSystem;

    public BookingTicketsService(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void bookTickets(int sum, LocalDateTime localDateTime) {
        //pro-booking for a date
        paymentSystem.acceptPayment(sum);
    }

}
