package com.perfume.exam.service;

import java.util.List;

import com.perfume.exam.vo.BoardVO;

public interface CustomerService {
	List<BoardVO> getNoticeList()throws Exception;
	List<BoardVO> getFAQList()throws Exception;
	String getBenefit() throws Exception;	
}
