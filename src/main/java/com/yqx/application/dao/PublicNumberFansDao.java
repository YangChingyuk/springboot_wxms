package com.yqx.application.dao;

import java.util.List;
import java.util.Map;

import com.yqx.application.entity.PublicNumberFans;
import com.yqx.application.vo.PublicNumberFansVO;


public interface PublicNumberFansDao extends BaseDao<PublicNumberFans>{
	
	public List<PublicNumberFansVO> queryViewByPage(Map<String,Integer> map);
}
