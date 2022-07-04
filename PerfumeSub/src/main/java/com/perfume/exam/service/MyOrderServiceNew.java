package com.perfume.exam.service;

import java.util.List;

import com.perfume.exam.vo.OrderDTO;
import com.perfume.exam.vo.OrderPageItemDTO;

public interface MyOrderServiceNew {

			
	// 주문 정보
	public List<OrderPageItemDTO> getGoodsInfo(List<OrderPageItemDTO> orders);
			
	// 주문 처리
	public void order(OrderDTO ord);
			
}
