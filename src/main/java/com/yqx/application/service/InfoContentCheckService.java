package com.yqx.application.service;

import java.util.List;

import com.yqx.application.entity.InfoContentCheck;
import com.yqx.application.vo.InfoContentCheckVO;


public interface InfoContentCheckService extends BaseService<InfoContentCheck>{

	public List<InfoContentCheckVO> queryViewByPage(int currentPage,int pageSize);
}
