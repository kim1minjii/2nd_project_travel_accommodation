package com.example.review.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.review.dto.ReviewDto;
import com.example.review.dto.ReviewPageDto;

// interface를 매퍼로 등록하기 위해서 사용
@Mapper
// 외부 I/O처리 (퍼시스턴스 레이어, DB나 파일같은 외부 I/O작업을 처리함
@Repository
public interface ReviewDao {
	public List<ReviewDto> list(ReviewPageDto pv);
	public ReviewDto content(int num);
	public void save(ReviewDto dto);
	public void update(ReviewDto dto);
	public void delete(int num);

}
