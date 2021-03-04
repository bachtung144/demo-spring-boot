package com.laptrinhjavaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages={"com.laptrinhjavaweb.entities"}) //phai them dong nay de chay
@EnableConfigurationProperties
//@EntityScan(basePackages = {"com.laptrinhjavaweb.entities"})  // scan JPA entities
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
