package io.tguduru.netflix.cloud.customer;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import io.tguduru.netflix.cloud.customer.config.CustomerConfiguration;
import io.tguduru.netflix.cloud.customer.health.CustomerAppHealthCheck;
import io.tguduru.netflix.cloud.customer.resource.CustomerResource;

public class CustomerApplication extends Application<CustomerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new CustomerApplication().run(args);
    }

    @Override
    public void run(final CustomerConfiguration customerConfiguration, final Environment environment) throws Exception {
        final CustomerResource customerResource = new CustomerResource();
        environment.jersey().register(customerResource);
        final CustomerAppHealthCheck customerAppHealthCheck = new CustomerAppHealthCheck();
        environment.jersey().register(customerAppHealthCheck);
    }
}