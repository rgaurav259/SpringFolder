package com.gaurav.restApitest.RestApiPlusTsting.Customer;

import com.gaurav.restApitest.RestApiPlusTsting.Error.ErrorResponse;
import com.gaurav.restApitest.RestApiPlusTsting.Exception.CustomerAlreadyExistsException;
import com.gaurav.restApitest.RestApiPlusTsting.Model.Customer;
import com.gaurav.restApitest.RestApiPlusTsting.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerController {


    // Exception Handler method added in CustomerController to
// handle CustomerAlreadyExistsException exception

    @ExceptionHandler(value = CustomerAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorResponse handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex)
    {
        return new ErrorResponse(HttpStatus.CONFLICT.value(),
                ex.getMessage());
    }

    @Autowired
    private CustomerService customerService;

    // Get Customer by Id
    @GetMapping("/getCustomer/{id}")
    public Customer getCustomer(@PathVariable("id") Long id)
    {
        return customerService.getCustomer(id);
    }

    // Add new Customer
    @PostMapping("/addCustomer")
    public String
    addcustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }

    // Update Customer details
    @PutMapping("/updateCustomer")
    public String
    updateCustomer(@RequestBody Customer customer)
    {
        return customerService.updateCustomer(customer);
    }
}
