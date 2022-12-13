package com.yf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @projectName: eureka-server
 * @package: com.yf
 * @className: EurekaClient02Application
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/13 11:04
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClient02Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient02Application.class,args);
    }
}
