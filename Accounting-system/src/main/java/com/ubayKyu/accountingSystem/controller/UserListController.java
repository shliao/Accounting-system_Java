package com.ubayKyu.accountingSystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ubayKyu.accountingSystem.service.LoginService;

@Controller
public class UserListController {
	@Autowired
	HttpSession session;

	@GetMapping("/UserList")
	public String userListPage() {
		if (LoginService.CheckLoginSession(session))
			return "AdminSystem/UserList";
		else
			return "redirect:/Login";
	}

	@GetMapping("/UserDetail")
	public String userDetailPage() {
		if (LoginService.CheckLoginSession(session))
			return "AdminSystem/UserDetail";
		else
			return "redirect:/Login";
	}
}
