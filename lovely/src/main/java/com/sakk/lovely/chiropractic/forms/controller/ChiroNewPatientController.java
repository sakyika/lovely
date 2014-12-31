package com.sakk.lovely.chiropractic.forms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/chiroNewPatientForm")
@PreAuthorize("denyAll")
public class ChiroNewPatientController {
	static Logger logger = LoggerFactory.getLogger(ChiroNewPatientController.class);
	
	@Autowired
	private MessageSource messageSource;
	
	

}
