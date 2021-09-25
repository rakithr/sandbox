package com.transactional.transactiondemo.dto;

import com.transactional.transactiondemo.entity.PassengerInformation;
import com.transactional.transactiondemo.entity.PaymentInformation;

public class FlightBookingDetails {
    private PassengerInformation passengerInformation;
    private PaymentInformation paymentInformation;

    public FlightBookingDetails() {
    }

    public FlightBookingDetails(PassengerInformation passengerInformation,
                                PaymentInformation paymentInformation) {
        this.passengerInformation = passengerInformation;
        this.paymentInformation = paymentInformation;
    }

    public PassengerInformation getPassengerInformation() {
        return passengerInformation;
    }

    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }
}
