package com.wgp.wgpgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WgpGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WgpGatewayApplication.class, args);
    }

}
