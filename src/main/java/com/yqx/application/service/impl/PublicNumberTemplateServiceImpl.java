package com.yqx.application.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.application.dao.PublicNumberTemplateDao;
import com.yqx.application.entity.PublicNumberTemplate;
import com.yqx.application.service.PublicNumberTemplateService;
import com.yqx.application.vo.PublicNumberTemplateVO;


@Service("publicNumberTemplateService")
public class PublicNumberTemplateServiceImpl extends BaseServiceImpl<PublicNumberTemplate> implements PublicNumberTemplateService{
	
	@Resource
	private PublicNumberTemplateDao publicNumberTemplateDao;
	
	@Override
	public List<PublicNumberTemplateVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return publicNumberTemplateDao.queryViewByPage(map);
	}

}
