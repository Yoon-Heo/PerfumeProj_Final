package com.perfume.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfume.exam.mapper.MemberMapper;
import com.perfume.exam.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberMapper membermapper;
	
	@Override
	public void memberJoin(MemberVO member) throws Exception {
		// TODO Auto-generated method stub
		membermapper.memberJoin(member);
	}

	@Override
	public int idCheck(String id) throws Exception {
		// TODO Auto-generated method stub
		return membermapper.idCheck(id);
	}

	@Override
	public MemberVO memberLogin(MemberVO member) throws Exception {
		// TODO Auto-generated method stub
		return membermapper.memberLogin(member);
	}

	@Override
	public String find_id(String email) throws Exception {
		// TODO Auto-generated method stub
		
		String id = membermapper.find_id(email);
		
		System.out.println("ID : " + id +" 입니다");

		return id;
	}
	
	// (추가) 주문자 정보
	@Override
	public MemberVO getMemberInfo(String id) {
		
			return membermapper.getMemberInfo(id);
		
	}
	
	


}
