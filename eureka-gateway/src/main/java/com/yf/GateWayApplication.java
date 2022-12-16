package com.yf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @projectName: springcloud-base
 * @package: com.yf
 * @className: GateWayApplication
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/15 17:00
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class,args);
    }
}
