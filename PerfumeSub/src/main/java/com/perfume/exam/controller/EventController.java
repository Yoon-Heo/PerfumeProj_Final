package com.perfume.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.perfume.exam.service.EventService;
import com.perfume.exam.vo.BoardVO;
import com.perfume.exam.vo.EventVO;

@RequestMapping("/event/")
@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("test")
	public String test(Model model) throws Exception {
		return "root.event.test"; 
	}
	
	@RequestMapping("event")
	public String event(Model model) throws Exception {
		
		List<EventVO> endList = eventService.getEndList();
		List<EventVO> ingList = eventService.getIngList();
		List<BoardVO> winnerList = eventService.getWinnerList();
		
		model.addAttribute("endList", endList);
		model.addAttribute("ingList", ingList);
		model.addAttribute("winnerList", winnerList);
//		
		return "root.event.event";
	}	
	
	
	@RequestMapping("detail")
	public String detail(@RequestParam(name="p")String page, Model model) throws Exception {
		
		EventVO event = eventService.getEvent(page);
		
		model.addAttribute("event", event);
		
		return "root.event.detail";
	}
	
	
}
