package com.transactional.transactiondemo.controller;

import com.transactional.transactiondemo.dto.FlightBookingAcknowledgement;
import com.transactional.transactiondemo.dto.FlightBookingDetails;
import com.transactional.transactiondemo.dto.FlightBookingRequest;
import com.transactional.transactiondemo.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flightBooking")
public class FlightBookingController {

    @Autowired
    FlightBookingService flightBookingService;

    @PostMapping
    public FlightBookingAcknowledgement request(@RequestBody FlightBookingRequest bookingRequest){
        return flightBookingService.clientRequest(bookingRequest);
    }

    @GetMapping("{passengerId}")
    public FlightBookingDetails getBookingInformation(@PathVariable("passengerId") Long passengerId){
        return flightBookingService.getBookingDetails(passengerId);
    }
}
