package com.yqx.application.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.application.dao.PublicNumberCheckDao;
import com.yqx.application.entity.PublicNumberCheck;
import com.yqx.application.vo.PublicNumberCheckVO;

@Repository("publicNumberCheckDao")
public class PublicNumberCheckDaoImpl extends BaseDaoImpl<PublicNumberCheck> implements PublicNumberCheckDao{

	@Override
	public List<PublicNumberCheckVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(PublicNumberCheck.class.getSimpleName()+".queryViewByPage",map);
	}

}
