package com.yqx.application.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.application.dao.PublicNumberCheckDao;
import com.yqx.application.entity.PublicNumberCheck;
import com.yqx.application.service.PublicNumberCheckService;
import com.yqx.application.vo.PublicNumberCheckVO;

@Service("publicNumberCheckService")
public class PublicNumberCheckServiceImpl extends BaseServiceImpl<PublicNumberCheck> implements PublicNumberCheckService{
	
	@Resource
	private PublicNumberCheckDao publicNumberCheckDao;
	
	@Override
	public List<PublicNumberCheckVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return publicNumberCheckDao.queryViewByPage(map);
	}

}
