package io.tguduru.spring.cloud.customer.dao;

import io.tguduru.spring.cloud.customer.model.Customer;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 4/2/16
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
