package com.yqx.application.dao;

import java.util.List;
import java.util.Map;

import com.yqx.application.entity.InfoContent;
import com.yqx.application.vo.InfoContentVO;


public interface InfoContentDao extends BaseDao<InfoContent>{
	
	public List<InfoContentVO> queryViewByPage(Map<String,Integer> map);
}
