package com.ubayKyu.accountingSystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ubayKyu.accountingSystem.service.LoginService;

@Controller
public class CategoryController {
	@Autowired
	HttpSession session;

	@GetMapping("/CategoryList")
	public String categoryListPage() {
		if (LoginService.CheckLoginSession(session))
			return "AdminSystem/CategoryList";
		else
			return "redirect:/Login";
	}

	@GetMapping("/CategoryDetail")
	public String categoryDetailPage() {
		if (LoginService.CheckLoginSession(session))
			return "AdminSystem/CategoryDetail";
		else
			return "redirect:/Login";
	}
}
