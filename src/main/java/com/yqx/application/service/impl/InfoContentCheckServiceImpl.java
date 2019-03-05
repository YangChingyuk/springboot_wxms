package com.yqx.application.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.application.dao.InfoContentCheckDao;
import com.yqx.application.entity.InfoContentCheck;
import com.yqx.application.service.InfoContentCheckService;
import com.yqx.application.vo.InfoContentCheckVO;

@Service("infoContentCheckService")
public class InfoContentCheckServiceImpl extends BaseServiceImpl<InfoContentCheck> implements InfoContentCheckService{
	
	@Resource
	private InfoContentCheckDao infoContentCheckDao;
	
	@Override
	public List<InfoContentCheckVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return infoContentCheckDao.queryViewByPage(map);
	}

}
