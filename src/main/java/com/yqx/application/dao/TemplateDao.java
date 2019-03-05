package com.yqx.application.dao;

import java.util.List;
import java.util.Map;

import com.yqx.application.entity.Template;
import com.yqx.application.vo.TemplateVO;


public interface TemplateDao extends BaseDao<Template>{
	
	public List<TemplateVO> queryViewByPage(Map<String,Integer> map);
}
