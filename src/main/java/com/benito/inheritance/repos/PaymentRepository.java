package com.benito.inheritance.repos;

import org.springframework.data.repository.CrudRepository;

import com.benito.inheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
