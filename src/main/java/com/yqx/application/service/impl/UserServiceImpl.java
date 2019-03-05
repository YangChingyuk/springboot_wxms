package com.yqx.application.service.impl;

import org.springframework.stereotype.Service;

import com.yqx.application.entity.User;
import com.yqx.application.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

}
