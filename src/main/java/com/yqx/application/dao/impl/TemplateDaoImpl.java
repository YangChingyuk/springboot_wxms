package com.yqx.application.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yqx.application.dao.TemplateDao;
import com.yqx.application.entity.Template;
import com.yqx.application.vo.TemplateVO;


@Repository("templateDao")
public class TemplateDaoImpl extends BaseDaoImpl<Template> implements TemplateDao{

	@Override
	public List<TemplateVO> queryViewByPage(Map<String, Integer> map) {
		return getSqlSession().selectList(Template.class.getSimpleName()+".queryViewByPage", map);
	}


}
