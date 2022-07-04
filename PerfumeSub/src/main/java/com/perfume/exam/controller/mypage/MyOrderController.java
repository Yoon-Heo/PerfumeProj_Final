package com.perfume.exam.controller.mypage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.perfume.exam.service.MyOrderService;
import com.perfume.exam.vo.MyOrderVO;

@Controller
public class MyOrderController {
	@Autowired 
	private MyOrderService myOrderService;
	
	@GetMapping("/myorder/{id}")
	public String myOrderGET(@PathVariable("id") String id, Model model,HttpServletRequest request
			  	,HttpServletResponse response) throws Exception {
		
		List<MyOrderVO> order = myOrderService.selectOrderList(id);
		
		model.addAttribute("order", order);
		
		return "root.mypage.orderlist";
	}

	// 주문내역 삭제(반품처리)
	@PostMapping("/deleteorder")
	public String deleteOrder(MyOrderVO mov) throws Exception  {
		
		myOrderService.deleteOrder(mov.getOrderId());
		
		return "redirect:/myorder/" + mov.getId(); 
	}
	
	
}
