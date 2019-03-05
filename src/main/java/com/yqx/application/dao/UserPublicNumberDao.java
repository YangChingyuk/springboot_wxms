package com.yqx.application.dao;

import java.util.List;
import java.util.Map;

import com.yqx.application.entity.UserPublicNumber;
import com.yqx.application.vo.UserPublicNumberVO;


public interface UserPublicNumberDao extends BaseDao<UserPublicNumber>{
	
	public List<UserPublicNumberVO> queryViewByPage(Map<String,Integer> map);
	
}
