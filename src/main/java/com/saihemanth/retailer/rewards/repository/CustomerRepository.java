package com.saihemanth.retailer.rewards.repository;


import com.saihemanth.retailer.rewards.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}