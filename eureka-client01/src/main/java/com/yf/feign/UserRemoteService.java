package com.yf.feign;

import com.yf.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @projectName: springcloud-base
 * @package: com.feign
 * @className: UserRemoteService
 * @author: yangfeng
 * @description: 用户服务service
 * @date: 2022/12/13 14:58
 * @version: 1.0
 */
@FeignClient("eureka-client02")
public interface UserRemoteService {
    @GetMapping("/user/getUserById")
    public UserDto getUserById(@RequestParam("id")Integer id);
}
