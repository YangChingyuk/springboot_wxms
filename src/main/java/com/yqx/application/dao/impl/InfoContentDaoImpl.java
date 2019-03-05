package com.yqx.application.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.application.dao.InfoContentDao;
import com.yqx.application.entity.InfoContent;
import com.yqx.application.vo.InfoContentVO;


@Repository("infoContentDao")
public class InfoContentDaoImpl extends BaseDaoImpl<InfoContent> implements InfoContentDao{

	@Override
	public List<InfoContentVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(InfoContent.class.getSimpleName()+".queryViewByPage", map);
	}

}
