package com.stuforum.demo.service.impl;

import com.stuforum.demo.dao.UserMapper;
import com.stuforum.demo.entity.User;
import com.stuforum.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean addUser() {

        User user = new User();


        return userMapper.insertSelective(user)==1;
    }
}
