package com.payment.PaymentDetails.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.PaymentDetails.model.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

	
}
