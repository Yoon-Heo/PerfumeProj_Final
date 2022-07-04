package com.perfume.exam.service.dao;

import java.util.List;


import com.perfume.exam.vo.MyOrderVO;

public interface MyOrderDAO {
	
	 // 주문내역 목록 (로그인 후 이용가능)
	 List<MyOrderVO> selectOrderList(String id) throws Exception;
	
	 // 주문내역 삭제
	 public void deleteOrder(int orderId) throws Exception;
}
