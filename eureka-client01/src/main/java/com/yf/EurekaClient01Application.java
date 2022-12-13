package com.yf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @projectName: eureka-server
 * @package: com.yf
 * @className: EurekaClient01Application
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/13 11:04
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaClient01Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient01Application.class,args);
    }
}
