package com.yqx.application.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.application.dao.PublicNumberTemplateDao;
import com.yqx.application.entity.PublicNumberTemplate;
import com.yqx.application.vo.PublicNumberTemplateVO;


@Repository("publicNumberTemplateDao")
public class PublicNumberTemplateDaoImpl extends BaseDaoImpl<PublicNumberTemplate> implements PublicNumberTemplateDao{

	@Override
	public List<PublicNumberTemplateVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(PublicNumberTemplate.class.getSimpleName()+".queryViewByPage", map);
	}

}
