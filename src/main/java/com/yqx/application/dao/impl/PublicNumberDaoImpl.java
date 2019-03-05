package com.yqx.application.dao.impl;

import org.springframework.stereotype.Repository;

import com.yqx.application.dao.PublicNumberDao;
import com.yqx.application.entity.PublicNumber;

@Repository("publicNumberDao")
public class PublicNumberDaoImpl extends BaseDaoImpl<PublicNumber> implements PublicNumberDao{

}
