package com.sakk.lovely.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sakk.lovely.model.user.User;

@Controller
public class HomeController {
	static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public String mainPage() {
		String rolename = getRole();
		logger.debug("Directing to home page for: [" + rolename + "]");

		if (rolename.equals("ROLE_ADMIN")) {
			return "home-admin";
		} else if (rolename.equals("ROLE_TRADER")) {
			return "home-trader";
		} else {
			return "home-user";
		}
	}

	@RequestMapping(value = "/index")
	public String indexPage() {
		return "redirect:/";
	}

	private String getRole() {
		String rolename = "";
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		System.out.println("right after getting principal"
				+ principal.toString());

		if (principal instanceof User) {
			rolename = ((User) principal).getRole().getRolename();
		} else {
			logger.error("Principal is not an instance of com.dtr.oas.model.User");
		}
		return rolename;
	}

}
