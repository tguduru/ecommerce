package io.tguduru.netflix.cloud.customer.resource;

import com.codahale.metrics.annotation.Timed;
import io.tguduru.netflix.cloud.customer.model.Customer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 4/2/16
 */
@Path("/customer")
public class CustomerResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Timed
    public Customer getCustomerDetails() {
        return new Customer(100, "Thiru", "thiru@mycompany.com", "123 Main St", "Main City", "Main State", "Main Country", "123456");
    }

}
