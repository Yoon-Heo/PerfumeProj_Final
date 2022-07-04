package com.perfume.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfume.exam.mapper.MemberMapper;
import com.perfume.exam.model.MemberVO;
import com.perfume.exam.service.MyEditService;

@Service
public class MyEditServiceImpl implements MyEditService {

	@Autowired
	private MemberMapper membermapper;
	
	 // 회원정보 수정(마이페이지)
	@Override
    public void memberEdit(MemberVO member) throws Exception {
    	
		membermapper.memberEdit(member);
    }
	
	// 회원 상세정보 조회
	@Override
	public MemberVO memberInfo(String id) {
		
		return membermapper.memberInfo(id);
	}
}
