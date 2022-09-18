package com.gaurav.restApitest.RestApiPlusTsting.service;

import com.gaurav.restApitest.RestApiPlusTsting.Model.Customer;

public interface CustomerService {

    // Method to get customer by its Id
    Customer getCustomer(Long id);

    // Method to add a new Customer
    // into the database
    String addCustomer(Customer customer);

    // Method to update details of a Customer
    String updateCustomer(Customer customer);
}
