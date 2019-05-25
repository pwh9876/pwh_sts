package com.pwh.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pwh.db.dto.*;
   
public interface ApiMapper {
	public List<Api_1> API_1() throws Exception;

	public List<Api_2> API_2() throws Exception;
	
	public List<Api_3> API_3() throws Exception;
	
	public List<Api_4> API_4(@Param("brName") String brName) throws Exception;
	
}
