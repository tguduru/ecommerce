package io.tguduru.spring.cloud.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.bigtech")
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class ProductApplication{

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
