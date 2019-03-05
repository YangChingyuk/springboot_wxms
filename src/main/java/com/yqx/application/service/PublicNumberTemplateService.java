package com.yqx.application.service;

import java.util.List;

import com.yqx.application.entity.PublicNumberTemplate;
import com.yqx.application.vo.PublicNumberTemplateVO;


public interface PublicNumberTemplateService extends BaseService<PublicNumberTemplate>{
	
	public List<PublicNumberTemplateVO> queryViewByPage(int currentPage,int pageSize);
}
