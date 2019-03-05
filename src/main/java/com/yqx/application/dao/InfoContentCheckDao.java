package com.yqx.application.dao;

import java.util.List;
import java.util.Map;

import com.yqx.application.entity.InfoContentCheck;
import com.yqx.application.vo.InfoContentCheckVO;


public interface InfoContentCheckDao extends BaseDao<InfoContentCheck>{
	
	public List<InfoContentCheckVO> queryViewByPage(Map<String,Integer> map);
}
