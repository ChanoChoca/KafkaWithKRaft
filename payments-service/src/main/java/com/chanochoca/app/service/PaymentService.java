package com.chanochoca.app.service;

import com.chanochoca.app.dto.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> findAll();

    Payment process(Payment payment);
}
