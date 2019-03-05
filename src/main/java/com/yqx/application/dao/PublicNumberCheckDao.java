package com.yqx.application.dao;

import java.util.List;
import java.util.Map;

import com.yqx.application.entity.PublicNumberCheck;
import com.yqx.application.vo.PublicNumberCheckVO;


public interface PublicNumberCheckDao extends BaseDao<PublicNumberCheck>{
	
	public List<PublicNumberCheckVO> queryViewByPage(Map<String,Integer> map);
}
