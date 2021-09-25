package com.transactional.transactiondemo.service;

import com.transactional.transactiondemo.dto.FlightBookingAcknowledgement;
import com.transactional.transactiondemo.dto.FlightBookingDetails;
import com.transactional.transactiondemo.dto.FlightBookingRequest;
import com.transactional.transactiondemo.entity.PassengerInformation;
import com.transactional.transactiondemo.entity.PaymentInformation;
import com.transactional.transactiondemo.repositories.PassengerRepository;
import com.transactional.transactiondemo.repositories.PaymentRepository;
import com.transactional.transactiondemo.validation.PaymentUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightBookingService {

//    @Autowired
//    private PaymentUnit paymentUnit;

    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional
    public FlightBookingAcknowledgement clientRequest(FlightBookingRequest bookingRequest) {
        PassengerInformation sentPassengerDetails = bookingRequest.getPassengerInformation();
        sentPassengerDetails = passengerRepository.save(sentPassengerDetails);

        PaymentInformation sentPaymentDetails = bookingRequest.getPaymentInformation();

        PaymentUnit.validateCreditAmount(sentPaymentDetails.getAccountNo(),
                                         sentPassengerDetails.getFare());

        sentPaymentDetails.setPassengerId(sentPassengerDetails.getId());
        sentPaymentDetails.setAmount(sentPassengerDetails.getFare());
        paymentRepository.save(sentPaymentDetails);

        return new FlightBookingAcknowledgement("Successful",
                                                sentPaymentDetails.getAmount(),
                                                sentPassengerDetails);
    }

    public FlightBookingDetails getBookingDetails(Long passengerId) {
        PassengerInformation findPassengerDetail = passengerRepository.findById(passengerId).get();
        PaymentInformation findPaymentDetail = paymentRepository.findByPassengerId(passengerId);

        return new FlightBookingDetails(findPassengerDetail, findPaymentDetail);
    }
}
