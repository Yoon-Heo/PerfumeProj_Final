package com.perfume.exam.mapper;

import com.perfume.exam.vo.OrderDTO;
import com.perfume.exam.vo.OrderItemDTO;
import com.perfume.exam.vo.OrderPageItemDTO;

public interface MyOrderMapper {

	// 주문 상품 정보 - 주문 페이지
	public OrderPageItemDTO getPerfumeInfo(int product_id);
	
	// 주문 상품 정보 - 주문 처리  
	public OrderItemDTO getOrderInfo(int product_id);
		
	// 주문 테이블 등록
	public int enrollOrder(OrderDTO ord);
	
	// 주문 item 테이블 등록
	public int enrollOrderItem(OrderItemDTO orid);
				
}
