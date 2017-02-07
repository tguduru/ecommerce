package io.tguduru.spring.cloud.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RefreshScope
@EnableAutoConfiguration
@EnableDiscoveryClient
public class CustomerApplication {

    @Value("${db.url}")
    private static String dbUrl;

    public static void main(final String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
        System.out.println("********   DB URL ******** : " + dbUrl);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}