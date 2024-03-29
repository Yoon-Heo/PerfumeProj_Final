package com.perfume.exam.service.dao;

import java.util.List;


import com.perfume.exam.vo.MyReviewVO;
import com.perfume.exam.vo.ReviewVO;

public interface MyReviewDAO {
	List<ReviewVO> selectReviewList(String id) throws Exception;
	
	public void enrollReview(MyReviewVO myreview);

	// 리뷰 삭제
	public void deleteReview(int reviewId) throws Exception;
	
	// public MyReviewVO getProductIdName(int productId);
	
}
