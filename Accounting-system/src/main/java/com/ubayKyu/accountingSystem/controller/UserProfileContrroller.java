package com.ubayKyu.accountingSystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ubayKyu.accountingSystem.service.LoginService;

@Controller
public class UserProfileContrroller {
	@Autowired
	HttpSession session;

	@GetMapping("/UserProfile")
	public String userProfilePage() {
		if (LoginService.CheckLoginSession(session))
			return "AdminSystem/UserProfile";
		else
			return "redirect:/Login";
	}
}
