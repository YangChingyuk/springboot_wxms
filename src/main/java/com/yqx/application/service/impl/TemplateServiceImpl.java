package com.yqx.application.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.application.dao.TemplateDao;
import com.yqx.application.entity.Template;
import com.yqx.application.service.TemplateService;
import com.yqx.application.vo.TemplateVO;

@Service("templateService")
public class TemplateServiceImpl extends BaseServiceImpl<Template> implements TemplateService{
	
	@Resource
	private TemplateDao templateDao;
	
	@Override
	public List<TemplateVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return templateDao.queryViewByPage(map);
	}

}
