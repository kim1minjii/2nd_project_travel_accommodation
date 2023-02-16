package com.example.review.dto;

public class ReviewPageDto {
	private int currentPage; // 현재페이지
	private int totalCount; // 총 레코드 수
	private int blockCount = 5; // 한 페이지에 보여줄 레코드 수
	private int blockPage = 3; // 한 블록에 보여줄 페이지 수
	private int totalPage; // 총 페이지 수
	private int startRow; // 시작 레코드 번호
	private int endRow; // 끝 레코드 번호
	private int startPage; // 한 블록의 시작 페이지 번호
	private int endPage; // 한 블록의 끝 페이지 번호
	private int number;

}
