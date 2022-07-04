package com.perfume.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.perfume.exam.service.ReviewService;
import com.perfume.exam.vo.Criteria;
import com.perfume.exam.vo.ReviewPageVO;
import com.perfume.exam.vo.ReviewVO;

@RestController
@RequestMapping("/review")
public class ReviewController {

		@Autowired
		private ReviewService reviewService;
		
		// 리뷰 등록
		@PostMapping("/enroll")
		public void enrollReviewPOST(ReviewVO rvo) {
			reviewService.enrollReview(rvo);
			
		}
		
		// 리뷰 페이징
		/*
		@GetMapping(value="/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
		public ReviewPageVO reviewListPOST(Criteria cri) {
			
			return reviewService.reviewList(cri);
		}
		*/
}
