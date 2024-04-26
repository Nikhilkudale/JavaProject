package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")
	public List<customer> getAllCustomers() {
		return customerService.findAll();
	}
	
	@PostMapping("/customers")
	public customer addCustomer(@RequestBody customer custo) {
		return customerService.insert(custo);
	}
	
	@PutMapping("/customers")
	public customer updateCustomer(@RequestBody customer custo) {
		return customerService.update(custo);
	}
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable("id") customer customerId) {
		customerService.delete(customerId);
		return "Successfully deleted";
	}
}
