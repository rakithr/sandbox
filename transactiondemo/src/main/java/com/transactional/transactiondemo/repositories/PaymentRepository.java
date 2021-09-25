package com.transactional.transactiondemo.repositories;

import com.transactional.transactiondemo.entity.PaymentInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentInformation,String> {
    PaymentInformation findByPassengerId(Long passengerId);
}
