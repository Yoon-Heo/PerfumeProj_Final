package com.perfume.exam.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.perfume.exam.vo.BoardVO;
import com.perfume.exam.vo.EventVO;

@Mapper
public interface EventDAO {

	public List<EventVO> getEndList() throws Exception;
	
	public List<EventVO> getIngList() throws Exception;

	public List<BoardVO> getWinnerList() throws Exception;
	
	public EventVO getEvent(String page) throws Exception;
 
}
 