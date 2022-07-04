package com.perfume.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfume.exam.service.MyReviewService;
import com.perfume.exam.service.dao.MyReviewDAO;
import com.perfume.exam.vo.MyReviewVO;
import com.perfume.exam.vo.ReviewVO;

@Service("myReviewService")
public class MyReviewServiceImpl implements MyReviewService {
	
	@Autowired
	private MyReviewDAO myReviewDAO;
	
	@Override
	public List<ReviewVO> selectReviewList(String id) throws Exception {
		
		return myReviewDAO.selectReviewList(id);
	}

	
	@Override
	public void enrollReview(MyReviewVO myreview) {
		
		myReviewDAO.enrollReview(myreview);
		
	}

	// 리뷰 삭제	
	@Override
	public void deleteReview(int reviewId) throws Exception {
		
		myReviewDAO.deleteReview(reviewId);
	}
	
	/*
	@Override
	public MyReviewVO getProductIdName(int productId) {
		
		return myReviewDAO.getProductIdName(productId);
	}
	*/
}
