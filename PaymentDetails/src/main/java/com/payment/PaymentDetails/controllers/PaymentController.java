package com.payment.PaymentDetails.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.PaymentDetails.Repo.PaymentRepository;
import com.payment.PaymentDetails.model.Payment;


@RestController
public class PaymentController {
	@Autowired
	PaymentRepository paymentRepo;
	@GetMapping("/payments")
	public List<Payment> getAllCourses()
	{
		List<Payment> paymentList=paymentRepo.findAll();
		return paymentList;
	}

}
