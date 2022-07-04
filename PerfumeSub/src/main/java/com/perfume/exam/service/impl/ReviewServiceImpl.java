package com.perfume.exam.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfume.exam.service.ReviewService;
import com.perfume.exam.service.dao.ReviewDAO;
import com.perfume.exam.vo.Criteria;
import com.perfume.exam.vo.PageVO;
import com.perfume.exam.vo.ReviewPageVO;
import com.perfume.exam.vo.ReviewVO;

@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewDAO reviewDAO;
	
	@Override
	public int enrollReview(ReviewVO rvo) {
		
		int result = reviewDAO.enrollReview(rvo);
		
		return result;
		
	}
	
	// 리뷰목록 페이징
	/*
	@Override
	public ReviewPageVO reviewList(Criteria cri) {
		ReviewPageVO vo = new ReviewPageVO(); 	
			
		vo.setList(reviewDAO.getReviewList(cri));
		vo.setPageInfo(new PageVO(cri, reviewDAO.getReviewTotal(cri.getProductId())));
		
		return vo;
		
	}
	*/
}
