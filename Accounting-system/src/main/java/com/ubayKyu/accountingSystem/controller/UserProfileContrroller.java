package com.ubayKyu.accountingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileContrroller {
	@GetMapping("/UserProfile")
	public String userProfilePage() {

		return "AdminSystem/UserProfile";
	}
}
