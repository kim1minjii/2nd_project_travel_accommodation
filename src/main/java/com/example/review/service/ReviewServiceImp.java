package com.example.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.review.dao.ReviewDao;
import com.example.review.dto.ReviewDto;
import com.example.review.dto.ReviewPageDto;

// 비즈니스 로직이나 repository layer 호출하는 함수에 사용
@Service
public class ReviewServiceImp implements ReviewService {
	
	// 필요한 의존 객체의 "타입"에 해당하는 빈을 찾아 주입한다.
	// 생성자, setter, 필드
	@Autowired
	private ReviewDao dao;
	
	public ReviewServiceImp() {
		
	}
	
	public void setDao(ReviewDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<ReviewDto> listProcess(ReviewPageDto pv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProcess(ReviewDto dto) {
		dao.save(dto);
	}

	@Override
	public ReviewDto contentProcess(int num) {
		return dao.content(num);
	}

	@Override
	public ReviewDto updateSelectProcess(int num) {
		return dao.content(num);
	}

	@Override
	public void updateProcess(ReviewDto dto, String urlpath) {
		dao.update(dto);
	}

	@Override
	public void deleteProcess(int num, String urlpath) {
		dao.delete(num);
		
	}
	
}
