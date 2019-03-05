package com.yqx.application.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.application.dao.UserPublicNumberDao;
import com.yqx.application.entity.UserPublicNumber;
import com.yqx.application.vo.UserPublicNumberVO;

@Repository("userPublicNumberDao")
public class UserPublicNumberDaoImpl extends BaseDaoImpl<UserPublicNumber> implements UserPublicNumberDao{

	@Override
	public List<UserPublicNumberVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(UserPublicNumber.class.getSimpleName()+".queryViewByPage", map);
	}

}
