package com.yqx.application.dao.impl;

import org.springframework.stereotype.Repository;

import com.yqx.application.dao.UserDao;
import com.yqx.application.entity.User;


@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}
