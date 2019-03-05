package com.yqx.application.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumberFansVO {
	
	private String id;	//���
	private String pname;	//���ں�
	private String addFans;	//������˿��
	private String reduceFans;	//���ٷ�˿��
	@JSONField(format="yyyy-MM-dd")
	private Date countDate;	//ͳ������
	public PublicNumberFansVO(String id, String pname, String addFans, String reduceFans, Date countDate) {
		super();
		this.id = id;
		this.pname = pname;
		this.addFans = addFans;
		this.reduceFans = reduceFans;
		this.countDate = countDate;
	}
	public PublicNumberFansVO() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddFans() {
		return addFans;
	}
	public void setAddFans(String addFans) {
		this.addFans = addFans;
	}
	public String getReduceFans() {
		return reduceFans;
	}
	public void setReduceFans(String reduceFans) {
		this.reduceFans = reduceFans;
	}
	public Date getCountDate() {
		return countDate;
	}
	public void setCountDate(Date countDate) {
		this.countDate = countDate;
	}
	@Override
	public String toString() {
		return "PublicNumberFansVO [id=" + id + ", pname=" + pname + ", addFans=" + addFans + ", reduceFans="
				+ reduceFans + ", countDate=" + countDate + "]";
	}
	
	
}
