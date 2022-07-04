package com.perfume.exam.service.dao;

import java.util.List;


import com.perfume.exam.vo.MyWishVO;

public interface MyWishDAO {
	
	// 관심상품 목록 뷰에 표시
	List<MyWishVO> selectWishList(String id) throws Exception;
	
	// 관심목록 삭제
	public void deleteWish(int wishid) throws Exception;
	
	// 관심상품 목록에 추가
	public int addWish(MyWishVO wish) throws Exception;
	
	// 관심상품 목록 확인
	public MyWishVO checkWish(MyWishVO wish);
	
}
