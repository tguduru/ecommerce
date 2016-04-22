package io.tguduru.spring.cloud.customer.resource;

import io.tguduru.spring.cloud.customer.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 4/2/16
 */
@RestController
@RequestMapping(path = "/customer")
public class CustomerResource {

    @Autowired
    Environment environment;

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String customerDetails(@PathVariable(value = "id") final Long id) {
        System.out.println(environment.getProperty("db.url"));
        final List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("CONFIGSERVICE");
        ServiceInstance configServiceInstance = serviceInstanceList.get(0);
        String dbUrl = restTemplate.getForObject(configServiceInstance.getUri() + "/config/default", String.class);
        System.out.println(dbUrl);
        return "Customer is :" + id;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Customer addCustomer(@RequestBody final Customer customer) {

        return customer;
    }
}
