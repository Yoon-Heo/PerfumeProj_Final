package com.perfume.exam.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfume.exam.service.CartService;
import com.perfume.exam.service.dao.CartDAO;
import com.perfume.exam.vo.CartVO;
import com.perfume.exam.vo.PerfumeVO;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cartDAO;
	
	

	@Override
	public void newAddCart(CartVO cart) {
		cartDAO.newAddCart(cart);
		
	}



	@Override
public List<CartVO> getCart(String id) {
		
		List<CartVO> cart = cartDAO.getCart(id);	
		
		return cart;
	
	}



	@Override
	public void deleteCart(int cart_id) {
		// TODO Auto-generated method stub
		cartDAO.deleteCart(cart_id);
		
	}



	@Override
	public void cartModify(Map<String, Object> map) {
		// TODO Auto-generated method stub
		cartDAO.cartModify(map);
		
	}



	@Override
	public List<PerfumeVO> loadPrice(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return cartDAO.loadPrice(map);
	}




}
