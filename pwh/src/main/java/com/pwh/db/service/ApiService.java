package com.pwh.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwh.db.dto.*;
import com.pwh.db.mapper.*;

@Service
public class ApiService {
	@Autowired
	ApiMapper apiMapper;

	public List<Api_1> API_1() throws Exception {
		return apiMapper.API_1();
	}

	public List<Api_2> API_2() throws Exception {
		return apiMapper.API_2();
	}

	public List<Api_3> API_3() throws Exception {
		return apiMapper.API_3();
	}

	public List<Api_4> API_4(String brName) throws Exception {
		return apiMapper.API_4(brName);
	}
}
