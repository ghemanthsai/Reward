package com.saihemanth.retailer.rewards.controller;


import com.saihemanth.retailer.rewards.exception.ResourceNotFoundException;
import com.saihemanth.retailer.rewards.model.Customer;
import com.saihemanth.retailer.rewards.model.Rewards;
import com.saihemanth.retailer.rewards.repository.CustomerRepository;
import com.saihemanth.retailer.rewards.service.RewardsService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class RewardsController {

	@Autowired
	RewardsService rewardsService;

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping(value = "/{customerId}/rewards",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Rewards> getRewardsByCustomerId(@PathVariable("customerId") Long customerId) throws ResourceNotFoundException {
		Customer customer = customerRepository.findByCustomerId(customerId);
		if(customer == null)
		{
			throw new ResourceNotFoundException("Customer not found for this id :: " + customerId);
		}
		Rewards customerRewards = rewardsService.getRewardsByCustomerId(customerId);
		return new ResponseEntity<>(customerRewards, HttpStatus.OK);
	}

}