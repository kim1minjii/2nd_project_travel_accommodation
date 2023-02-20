package com.example.review.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.review.dto.ReviewPageDto;
import com.example.review.dto.ReviewPageDto;
import com.example.review.service.ReviewService;

// 웹페이지의 제한된 자원을 외부 도메인에서 접근을 허용해주는 메커니즘
@CrossOrigin(origins = {"http://localhost:3000/detail"})

// @ResponseBody + @Controller
// JSON 형태로 객체 데이터를 반환한다.
@RestController
public class ReviewController {
	
	@Autowired
	private ReviewPageDto pdto;
	
	@Autowired
	private ReviewService service;
	
	public ReviewController() {
		
	}
	
	public void setService(ReviewService service) {
		this.service = service;
	}
	
	@RequestMapping("review_detail/{currentPage}")
	 public Map<String,Object> listMethod(@PathVariable("currentPage") int currentPage,ReviewPageDto pv) {
	      System.out.println("currentPage:" + currentPage );
	      Map<String,Object> map = new HashMap<>();
	      
	      String totalRecord = service.contentProcess();
	      
	
//	@RequestMapping
//	public Map<String, Object> listMethod(@PathVariable("currentPage") int currentPage, ReviewPageDto pv) {
//		return map;
//	}
	
	

}
