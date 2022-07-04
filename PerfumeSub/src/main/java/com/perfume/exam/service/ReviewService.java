package com.perfume.exam.service;

import java.util.List;

import com.perfume.exam.vo.Criteria;
import com.perfume.exam.vo.ReviewPageVO;
import com.perfume.exam.vo.ReviewVO;

public interface ReviewService {

	// 상품리뷰 등록
	public int enrollReview(ReviewVO rvo);
	
	// 리뷰 페이징
	// public ReviewPageVO reviewList(Criteria cri);
	
}
