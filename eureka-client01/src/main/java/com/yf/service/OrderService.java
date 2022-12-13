package com.yf.service;

import com.yf.dto.OrderQueryDto;
import com.yf.dto.UserDto;
import com.yf.feign.UserRemoteService;
import com.yf.vo.OrderVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @projectName: springcloud-base
 * @package: com.yf.service
 * @className: OrderService
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/13 15:17
 * @version: 1.0
 */
@Service
public class OrderService {

    @Resource
    private UserRemoteService userRemoteService;

    public OrderVo getOrderDetail(OrderQueryDto queryDto){
        UserDto userDto = userRemoteService.getUserById(queryDto.getUserId());
        OrderVo orderVo = new OrderVo();
        BeanUtils.copyProperties(queryDto,orderVo);
        orderVo.setName(userDto.getName());
        return orderVo;


    }
}
