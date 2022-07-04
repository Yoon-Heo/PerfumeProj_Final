package com.perfume.exam.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.perfume.exam.vo.MyCartVO;

@Mapper
public interface MyCartDAO {

	// 카트추가
	public int addMyCart(MyCartVO mycart) throws Exception;
	
	// 카트삭제
	public int deleteCart(int cart_id);
	
	// 수량수정
	public int modifyCart(MyCartVO mycart);
	
	// 카트 목록(조회)
	public List<MyCartVO> getCart(String id);
	
	// 카트 확인
	public MyCartVO checkCart(MyCartVO mycart);
	
	// 카트 제거(주문처리)
	public int deleteOrderCart(MyCartVO mvo);
	
}
