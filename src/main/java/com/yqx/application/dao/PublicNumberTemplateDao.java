package com.yqx.application.dao;

import java.util.List;
import java.util.Map;

import com.yqx.application.entity.PublicNumberTemplate;
import com.yqx.application.vo.PublicNumberTemplateVO;


public interface PublicNumberTemplateDao extends BaseDao<PublicNumberTemplate>{

	public List<PublicNumberTemplateVO> queryViewByPage(Map<String,Integer> map);
}
