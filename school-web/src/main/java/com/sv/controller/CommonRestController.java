package com.sv.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.sv.req.beans.UserReq;

@Controller
public class CommonRestController {

	Logger logger = Logger.getLogger(CommonRestController.class);

	@Autowired
	private RestTemplate rt;

	@RequestMapping(method = RequestMethod.POST, value = "/applogin")
	public String login(@RequestBody UserReq requset) {
		logger.info("CommonRestController login: " + requset.getUsername());
		return "site.homepage";
	}

}
