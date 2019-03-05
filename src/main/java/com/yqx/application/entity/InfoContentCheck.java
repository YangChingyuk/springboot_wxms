package com.yqx.application.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class InfoContentCheck {
	
	private String id;	//���
	private String pid;	//���ں�
	private String content;	//��Ϣ����
	private String userid;	//������
	@JSONField(format="yyyy-MM-dd")
	private Date applyTime;	//�ύʱ��
	private int state;	//����Ƿ�ͨ��
	private String advise;	//������
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp checkedTime;	//���ʱ��
	public InfoContentCheck(String id, String pid, String content, String userid, Date applyTime, int state,
			String advise, Timestamp checkedTime) {
		super();
		this.id = id;
		this.pid = pid;
		this.content = content;
		this.userid = userid;
		this.applyTime = applyTime;
		this.state = state;
		this.advise = advise;
		this.checkedTime = checkedTime;
	}
	public InfoContentCheck() {
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getAdvise() {
		return advise;
	}
	public void setAdvise(String advise) {
		this.advise = advise;
	}
	public Timestamp getCheckedTime() {
		return checkedTime;
	}
	public void setCheckedTime(Timestamp checkedTime) {
		this.checkedTime = checkedTime;
	}
	@Override
	public String toString() {
		return "InfoContentCheck [id=" + id + ", pid=" + pid + ", content=" + content + ", userid=" + userid
				+ ", applyTime=" + applyTime + ", state=" + state + ", advise=" + advise + ", checkedTime="
				+ checkedTime + "]";
	}
	
}
