package com.yf.controller;

import com.yf.dto.OrderQueryDto;
import com.yf.service.OrderService;
import com.yf.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: springcloud-base
 * @package: com.yf.controller
 * @className: OrderController
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/13 15:25
 * @version: 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("getOderDetail")
    public OrderVo getOrderDetail(@RequestBody OrderQueryDto queryDto){
        return orderService.getOrderDetail(queryDto);
    }
    @GetMapping("/getOrder")
    public String getOrder(){
        return "获取订单成功";
    }

}
