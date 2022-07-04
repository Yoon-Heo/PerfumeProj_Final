package com.perfume.exam.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.perfume.exam.mapper.MemberMapper;
import com.perfume.exam.model.MemberVO;
import com.perfume.exam.service.MemberService;
import com.perfume.exam.service.MemberServiceImpl;


public class CartInterceptor implements HandlerInterceptor {
    
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

				
		HttpSession session = request.getSession();				
	    	
		MemberVO mvo = (MemberVO)session.getAttribute("member");
		System.out.println("interceptor 진입");
		if(mvo == null) {
			
			System.out.println("interceptor 비로그인 상태");
			
			response.setContentType("text/html; charset=UTF-8"); 
			PrintWriter out = response.getWriter();
			 
			out.println("<script>alert('장바구니는 로그인 후 사용 가능합니다'); location.href='/perfume/home'; </script>");
			out.flush();
						
			return false;
		} else {
			
			System.out.println("interceptor 로그인 상태");
			
			return true;

		}
		
		
	}

}

