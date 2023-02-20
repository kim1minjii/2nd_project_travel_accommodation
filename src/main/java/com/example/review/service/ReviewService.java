package com.example.review.service;

import java.util.List;

import com.example.review.dto.ReviewDto;
import com.example.review.dto.ReviewPageDto;

public interface ReviewService {
	public List<ReviewDto> listProcess(ReviewPageDto pv);
	public void insertProcess(ReviewDto dto);
	public ReviewDto contentProcess(ReviewDto dto, String urlpath);
	public ReviewDto updateSelectProcess(int num);
	public void updateProcess(ReviewDto dto, String urlpath);
	public void deleteProcess(int num, String urlpath);
	

}
