package com.yqx.application.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.application.dao.PublicNumberFansDao;
import com.yqx.application.entity.PublicNumberFans;
import com.yqx.application.service.PublicNumberFansService;
import com.yqx.application.vo.PublicNumberFansVO;

@Service("publicNumberFansService")
public class PublicNumberFansServiceImpl extends BaseServiceImpl<PublicNumberFans> implements PublicNumberFansService{
	
	@Resource
	private PublicNumberFansDao publicNumberFansDao;
	
	@Override
	public List<PublicNumberFansVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return publicNumberFansDao.queryViewByPage(map);
	}

}
