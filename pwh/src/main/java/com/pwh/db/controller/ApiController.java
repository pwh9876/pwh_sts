package com.pwh.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pwh.db.dto.*;
import com.pwh.db.service.*;

@Controller
public class ApiController {

	@Autowired
	ApiService apiService;

	@RequestMapping(value = "/api1", method = RequestMethod.GET)
	public @ResponseBody List<Api_1> query1() throws Exception {
		return apiService.API_1();
	}

	@RequestMapping(value = "/api2", method = RequestMethod.GET)
	public @ResponseBody List<Api_2> query2() throws Exception {
		return apiService.API_2();
	}

	@RequestMapping(value = "/api3", method = RequestMethod.GET)
	public @ResponseBody List<Api_3> query3() throws Exception {

		return apiService.API_3();
	}

	@RequestMapping(value = "/api4", method = RequestMethod.GET)
	public @ResponseBody List<Api_4> query4(@RequestParam(value = "brName") String brName) throws Exception {
		return apiService.API_4(brName);
	}
}
