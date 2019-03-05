package com.yqx.application.service;

import java.util.List;

import com.yqx.application.entity.InfoContent;
import com.yqx.application.vo.InfoContentVO;


public interface InfoContentService extends BaseService<InfoContent>{
	
	public List<InfoContentVO> queryViewByPage(int currentPage,int pageSize);
}
