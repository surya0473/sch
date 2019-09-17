package com.sv.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.dao.CommonDao;
import com.sv.entity.UserTraffic;

@Service
public class CommonService {
	
	Logger logger = Logger.getLogger(CommonService.class);
	
	@Autowired
	CommonDao dao;

	public void saveRequest(HttpServletRequest request) {
		logger.info("CommonService saveRequest");
		UserTraffic ut = new UserTraffic();
		ut.setDateTime(new Date());
		ut.setIpAddress(request.getRemoteAddr());
		ut.setReqPage(request.getRequestURI());
		ut.setReqType(request.getMethod());
		logger.info("CommonService saveRequest"+ut);
		ut=dao.save(ut);
		logger.info("CommonService saveRequest"+ut.getReqId());
	}

}
