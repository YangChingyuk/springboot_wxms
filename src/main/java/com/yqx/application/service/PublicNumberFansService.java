package com.yqx.application.service;

import java.util.List;

import com.yqx.application.entity.PublicNumberFans;
import com.yqx.application.vo.PublicNumberFansVO;


public interface PublicNumberFansService extends BaseService<PublicNumberFans>{
	
	public List<PublicNumberFansVO> queryViewByPage(int currentPage,int pageSize);
}
