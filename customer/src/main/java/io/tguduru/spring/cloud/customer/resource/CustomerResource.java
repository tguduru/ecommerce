package io.tguduru.spring.cloud.customer.resource;

import io.tguduru.spring.cloud.customer.model.Customer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 4/2/16
 */
@RestController
@RequestMapping(path = "/customer")
public class CustomerResource {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String customerDetails(@PathVariable(value = "id") final Long id) {
        return "Customer is :" + id;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Customer addCustomer(@RequestBody final Customer customer) {

        return customer;
    }
}
