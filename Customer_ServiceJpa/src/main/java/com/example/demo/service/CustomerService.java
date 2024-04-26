package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.customer;

@Service
public class CustomerService {

    @Autowired
    private customerJpa customerRepository;

    public List<customer> findAll() {
        return customerRepository.findAll();
    }

    public customer insert(customer cust) {
        return customerRepository.save(cust);
    }

    public customer update(customer cust) {
        return customerRepository.save(cust);
    }

    public void delete(customer cust) {
        customerRepository.delete(cust);
    }

    public Optional<customer> findById(int id) {
        return customerRepository.findById(id);
    }
}
