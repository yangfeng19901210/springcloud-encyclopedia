package com.yf.service;

import com.yf.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: springcloud-base
 * @package: com.yf.service
 * @className: UserService
 * @author: yangfeng
 * @description: TODO
 * @date: 2022/12/13 15:08
 * @version: 1.0
 */
@Service
public class UserService {
    private static final Map<Integer,SysUser> userDb = new HashMap<Integer, SysUser>();
    static {
        userDb.put(1,SysUser.builder().id(1).name("张三").build());
        userDb.put(2,SysUser.builder().id(1).name("李四").build());
        userDb.put(3,SysUser.builder().id(1).name("王五").build());
        userDb.put(4,SysUser.builder().id(1).name("赵六").build());
        userDb.put(5,SysUser.builder().id(1).name("小七").build());
    }

    public SysUser getUserById(Integer id){
        return userDb.get(id);
    }
}
