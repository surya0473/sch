package com.sv.controller;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sv.service.CommonService;

@Controller
public class CommonController {
	Logger logger = Logger.getLogger(CommonController.class);
	
	@Autowired
	private CommonService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String launchHomePage(HttpServletRequest request) {
		service.saveRequest(request);
		logger.info("Lanched homepage");
		return "site.homepage";
	}

	@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public String aboutUs() {
		logger.info("Lanched aboutus");
		return "site.aboutus";
	}

	@RequestMapping(value = "/contactus", method = RequestMethod.GET)
	public String contactUs() {
		logger.info("Lanched contactus");
		return "site.contactus";
	}
	
	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public String clients() {
		logger.info("Lanched clients");
		return "site.clients";
	}
	
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String services() {
		logger.info("Lanched services");
		return "site.services";
	}
	
	@RequestMapping(value = "/investors", method = RequestMethod.GET)
	public String investors() {
		logger.info("Lanched investors");
		return "site.investors";
	}
	
	@RequestMapping(value = "/pricing", method = RequestMethod.GET)
	public String pricing() {
		logger.info("Lanched pricing");
		return "site.pricing";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		logger.info("Lanched login");
		return "site.login";
	}

}
