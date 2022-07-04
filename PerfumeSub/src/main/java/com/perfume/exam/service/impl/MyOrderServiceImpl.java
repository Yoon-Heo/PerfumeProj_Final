package com.perfume.exam.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfume.exam.service.MyOrderService;
import com.perfume.exam.service.dao.MyOrderDAO;
import com.perfume.exam.vo.MyOrderVO;

@Service("myOrderService")
public class MyOrderServiceImpl implements MyOrderService {

	@Autowired
	private MyOrderDAO myOrderDAO;
	
	
	@Override
	@Transactional
	public List<MyOrderVO> selectOrderList(String id) throws Exception {
		
		return myOrderDAO.selectOrderList(id);
	}
	
	
	@Override
	public void deleteOrder(int orderId) throws Exception {
		
		myOrderDAO.deleteOrder(orderId);
		
	}
	
	
}
