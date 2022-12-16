package com.yf.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: springcloud-base
 * @package: com.yf.config
 * @className: RouteConfig
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/16 10:26
 * @version: 1.0
 */
@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route(p -> p.path("/taobao").filters(f ->f.stripPrefix(1)).uri("https://www.taobao.com"));
        routes.route(p -> p.path("/baidu").filters(f ->f.stripPrefix(1)).uri("https://www.baidu.com"));
        return routes.build();

    }
}
