package com.mycompany.mypet.domain;

import java.util.Date;

public class RegisterVO {

	private Integer register_no;

	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;
	
	public Integer getRegister_no() {
		return register_no;
	}
	public void setRegister_no(Integer register_no) {
		this.register_no = register_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RegisterVO [register_no=" + register_no + ", title="+ title + ", content="+ content + ", writer="+ writer + ", regDate="+ regDate + ", viewCnt="+ viewCnt + "]" ;


	}
	
	
	
	

}
