package com.mqc.test.provider.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.mqc.test.provider.mapper.UserMapper;
import model.User;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author : Ar1es
 * @date : 2019/7/30
 * @since : Java 8
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        List<User> users = userMapper.getAll();
        System.out.println("size ：" + users.size());
        return userMapper.getAll();
    }
}
