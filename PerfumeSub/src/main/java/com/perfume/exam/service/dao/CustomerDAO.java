package com.perfume.exam.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.perfume.exam.vo.BoardVO;

@Mapper
public interface CustomerDAO {

	List<BoardVO> getNoticeList() throws Exception;
	List<BoardVO> getFAQList() throws Exception;
	String getBenefit() throws Exception;

}
 