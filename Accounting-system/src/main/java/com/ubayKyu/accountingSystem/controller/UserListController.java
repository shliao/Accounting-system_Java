package com.ubayKyu.accountingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserListController {
	@GetMapping("/UserList")
	public String userListPage() {

		return "AdminSystem/UserList";
	}
	
	@GetMapping("/UserDetail")
	public String userDetailPage() {

		return "AdminSystem/UserDetail";
	}
}
