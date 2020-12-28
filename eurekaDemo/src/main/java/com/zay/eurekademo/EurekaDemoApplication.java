package com.zay.eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author AnYuan
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDemoApplication.class, args);
    }

}