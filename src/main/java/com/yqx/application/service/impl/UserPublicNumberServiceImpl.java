package com.yqx.application.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqx.application.dao.UserPublicNumberDao;
import com.yqx.application.entity.UserPublicNumber;
import com.yqx.application.service.UserPublicNumberService;
import com.yqx.application.vo.UserPublicNumberVO;

@Service("userPublicNumberService")
public class UserPublicNumberServiceImpl extends BaseServiceImpl<UserPublicNumber> implements UserPublicNumberService{
	
	@Resource
	private UserPublicNumberDao userPublicNumberDao;
	
	@Override
	public List<UserPublicNumberVO> queryViewByPage(int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", currentPage * pageSize);
		map.put("end", (currentPage-1)*pageSize);
		return userPublicNumberDao.queryViewByPage(map);
	}

}
