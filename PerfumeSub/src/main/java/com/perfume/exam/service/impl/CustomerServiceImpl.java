package com.perfume.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfume.exam.service.dao.CustomerDAO;
import com.perfume.exam.service.CustomerService;
import com.perfume.exam.vo.BoardVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;
	
	@Override
	public List<BoardVO> getNoticeList() throws Exception {
		
		List<BoardVO> noticeList = customerDao.getNoticeList();		
		return noticeList;		
	}
	
	@Override
	public List<BoardVO> getFAQList() throws Exception {
		
		List<BoardVO> faqList = customerDao.getFAQList();
		return faqList;		
	}

	@Override
	public String getBenefit() throws Exception {

		String benefit = customerDao.getBenefit();
		return benefit;
	}
	
}
