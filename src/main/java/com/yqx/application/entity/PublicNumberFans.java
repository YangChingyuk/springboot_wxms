package com.yqx.application.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumberFans {
	
	private String id;	//���
	private String pid;	//���ں�
	private String addFans;	//������˿��
	private String reduceFans;	//���ٷ�˿��
	@JSONField(format="yyyy-MM-dd")
	private Date countDate;	//ͳ������
	public PublicNumberFans(String id, String pid, String addFans, String reduceFans, Date countDate) {
		super();
		this.id = id;
		this.pid = pid;
		this.addFans = addFans;
		this.reduceFans = reduceFans;
		this.countDate = countDate;
	}
	public PublicNumberFans() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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
		return "Wxms_Public_Number_Fans [id=" + id + ", pid=" + pid + ", addFans=" + addFans + ", reduceFans="
				+ reduceFans + ", countDate=" + countDate + "]";
	}
	
	
}
