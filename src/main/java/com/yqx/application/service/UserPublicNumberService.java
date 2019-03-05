package com.yqx.application.service;

import java.util.List;

import com.yqx.application.entity.UserPublicNumber;
import com.yqx.application.vo.UserPublicNumberVO;


public interface UserPublicNumberService extends BaseService<UserPublicNumber>{
	
	public List<UserPublicNumberVO> queryViewByPage(int currentPage,int pageSize);
}
