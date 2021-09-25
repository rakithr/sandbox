package com.transactional.transactiondemo.dto;

import com.transactional.transactiondemo.entity.PassengerInformation;

public class FlightBookingAcknowledgement {
    private String status;
    private double totalFare;

    public FlightBookingAcknowledgement(String status,
                                        double totalFare,
                                        PassengerInformation passengerInformation) {
        this.status = status;
        this.totalFare = totalFare;
        this.passengerInformation = passengerInformation;
    }

    private PassengerInformation passengerInformation;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public PassengerInformation getPassengerInformation() {
        return passengerInformation;
    }

    public void setPassengerInformation(PassengerInformation passengerInformation) {
        this.passengerInformation = passengerInformation;
    }
}
