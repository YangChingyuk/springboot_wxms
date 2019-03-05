package com.yqx.application.service;

import java.util.List;

import com.yqx.application.entity.Template;
import com.yqx.application.vo.TemplateVO;


public interface TemplateService extends BaseService<Template>{
	
	public List<TemplateVO> queryViewByPage(int currentPage,int pageSize);
}
