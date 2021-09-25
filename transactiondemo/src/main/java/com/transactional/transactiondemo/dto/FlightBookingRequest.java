package com.transactional.transactiondemo.dto;

import com.transactional.transactiondemo.entity.PassengerInformation;
import com.transactional.transactiondemo.entity.PaymentInformation;

public class FlightBookingRequest {
    private PassengerInformation passengerInformation;
    private PaymentInformation paymentInformation;

    public PassengerInformation getPassengerInformation() {
        return passengerInformation;
    }

    public void setPassengerInformation(PassengerInformation passengerInformation) {
        this.passengerInformation = passengerInformation;
    }

    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(PaymentInformation paymentInformation) {
        this.paymentInformation = paymentInformation;
    }
}
