package com.perfume.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfume.exam.service.EventService;
import com.perfume.exam.service.dao.EventDAO;
import com.perfume.exam.vo.BoardVO;
import com.perfume.exam.vo.EventVO;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventDAO eventDAO;
	
	@Override
	public List<EventVO> getEndList() throws Exception {

		List<EventVO> endList = eventDAO.getEndList();
		return endList;
	}

	@Override
	public List<EventVO> getIngList() throws Exception {

		List<EventVO> ingList = eventDAO.getIngList();		
		return ingList;
	}

	@Override
	public List<BoardVO> getWinnerList() throws Exception {
		
		List<BoardVO> winnerList = eventDAO.getWinnerList();
		return winnerList;
	}

	@Override
	public EventVO getEvent(String page) throws Exception {
		
		EventVO event = eventDAO.getEvent(page);
		return event;
	}

	
}
