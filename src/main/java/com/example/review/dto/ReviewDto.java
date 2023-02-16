package com.example.review.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

// 개발자가 직접 작성한 Class를 Bean으로 등록하기 위한 어노테이션
@Component
public class ReviewDto {
	private int rev_id, ac_id, rev_rating;
	private String login_id, rev_content, rev_tag;
	private Date rev_created_date, rev_updated_date;
	
	public ReviewDto() {
		// TODO Auto-generated constructor stub
	}

	public int getRev_id() {
		return rev_id;
	}

	public void setRev_id(int rev_id) {
		this.rev_id = rev_id;
	}

	public int getAc_id() {
		return ac_id;
	}

	public void setAc_id(int ac_id) {
		this.ac_id = ac_id;
	}

	public int getRev_rating() {
		return rev_rating;
	}

	public void setRev_rating(int rev_rating) {
		this.rev_rating = rev_rating;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getRev_content() {
		return rev_content;
	}

	public void setRev_content(String rev_content) {
		this.rev_content = rev_content;
	}

	public String getRev_tag() {
		return rev_tag;
	}

	public void setRev_tag(String rev_tag) {
		this.rev_tag = rev_tag;
	}

	public Date getRev_created_date() {
		return rev_created_date;
	}

	public void setRev_created_date(Date rev_created_date) {
		this.rev_created_date = rev_created_date;
	}

	public Date getRev_updated_date() {
		return rev_updated_date;
	}

	public void setRev_updated_date(Date rev_updated_date) {
		this.rev_updated_date = rev_updated_date;
	}
	
	
	
	
	


}
