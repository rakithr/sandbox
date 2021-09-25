package com.transactional.transactiondemo.repositories;

import com.transactional.transactiondemo.entity.PassengerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<PassengerInformation,Long> {
}
