package com.perfume.exam.service.dao;


import java.util.List;

import com.perfume.exam.vo.Criteria;
import com.perfume.exam.vo.ReviewVO;

public interface ReviewDAO {

	// 상품리뷰 등록
	public int enrollReview(ReviewVO rvo);
	
	// 상세페이지 하단 리뷰 목록(페이징 X)
	//public List<ReviewVO>
	
	
	// 리뷰목록 페이징
	// public List<ReviewVO> getReviewList(Criteria cri);

	// 리뷰 총 개수 (페이징)
	// public int getReviewTotal(int productId);

}
