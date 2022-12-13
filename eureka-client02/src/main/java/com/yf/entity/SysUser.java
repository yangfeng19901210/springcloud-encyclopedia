package com.yf.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @projectName: springcloud-base
 * @package: com.yf.entity
 * @className: SysUser
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/13 15:04
 * @version: 1.0
 */
@Data
@Builder
public class SysUser {
    private Integer id;

    private String name;
}
