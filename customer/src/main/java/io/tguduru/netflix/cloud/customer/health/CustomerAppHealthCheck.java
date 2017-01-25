package io.tguduru.netflix.cloud.customer.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * @author Guduru, Thirupathi (tg028792)
 */
public class CustomerAppHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
