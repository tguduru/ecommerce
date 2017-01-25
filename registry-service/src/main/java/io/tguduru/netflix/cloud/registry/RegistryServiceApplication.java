package io.tguduru.netflix.cloud.registry;

import com.netflix.eureka.EurekaBootStrap;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import io.tguduru.netflix.cloud.registry.config.RegistryConfiguration;

/**
 *
 */
public class RegistryServiceApplication extends Application<RegistryConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RegistryServiceApplication().run(args);
    }

    /**
     * When the application runs, this is called after the {@link io.dropwizard.Bundle}s are run. Override it to add
     * providers, resources, etc. for your application.
     * @param configuration the parsed {@link io.dropwizard.Configuration} object
     * @param environment the application's {@link Environment}
     * @throws Exception if something goes wrong
     */
    @Override
    public void run(final RegistryConfiguration configuration, final Environment environment) throws Exception {
        environment.servlets().addServletListeners(new EurekaBootStrap());
    }
}
