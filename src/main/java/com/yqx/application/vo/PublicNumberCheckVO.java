package com.yqx.application.vo;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumberCheckVO {
	
	private String id;	//���
	private String pname;	//���ںű��
	private String uname;	//�����˱��
	@JSONField(format="yyyy-MM-dd")
	private Date applyTime;	//�ύʱ��
	private String advise;	//������
	private int state;	//����Ƿ�ͨ��
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp checkedTime;	//���ʱ��
	public PublicNumberCheckVO(String id, String pname, String uname, Date applyTime, String advise, int state,
			Timestamp checkedTime) {
		super();
		this.id = id;
		this.pname = pname;
		this.uname = uname;
		this.applyTime = applyTime;
		this.advise = advise;
		this.state = state;
		this.checkedTime = checkedTime;
	}
	public PublicNumberCheckVO() {
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getAdvise() {
		return advise;
	}
	public void setAdvise(String advise) {
		this.advise = advise;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Timestamp getCheckedTime() {
		return checkedTime;
	}
	public void setCheckedTime(Timestamp checkedTime) {
		this.checkedTime = checkedTime;
	}
	@Override
	public String toString() {
		return "PublicNumberCheckVO [id=" + id + ", pname=" + pname + ", uname=" + uname + ", applyTime=" + applyTime
				+ ", advise=" + advise + ", state=" + state + ", checkedTime=" + checkedTime + "]";
	}
	
	
}
