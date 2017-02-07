package io.tguduru.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@Configuration
@EnableAutoConfiguration
public class ConfigServiceApplication {

  public static void main(final String[] args) {
    SpringApplication.run(ConfigServiceApplication.class, args);
  }
}
