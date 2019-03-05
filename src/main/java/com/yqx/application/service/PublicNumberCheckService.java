package com.yqx.application.service;

import java.util.List;

import com.yqx.application.entity.PublicNumberCheck;
import com.yqx.application.vo.PublicNumberCheckVO;


public interface PublicNumberCheckService extends BaseService<PublicNumberCheck>{
	
	public List<PublicNumberCheckVO> queryViewByPage(int currentPage,int pageSize);
}
