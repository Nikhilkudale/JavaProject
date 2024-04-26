package com.example.demo.service;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.customer;

public interface customerJpa extends JpaRepositoryImplementation<customer, Integer> {

}
