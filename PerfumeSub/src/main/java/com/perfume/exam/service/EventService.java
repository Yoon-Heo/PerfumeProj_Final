package com.perfume.exam.service;

import java.util.List;

import com.perfume.exam.vo.BoardVO;
import com.perfume.exam.vo.EventVO;

public interface EventService {

	public List<EventVO> getEndList() throws Exception;
	public List<EventVO> getIngList() throws Exception;
	public List<BoardVO> getWinnerList() throws Exception;
	public EventVO getEvent(String page) throws Exception;

}






