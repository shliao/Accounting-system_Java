package com.ubayKyu.accountingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
	@GetMapping("/CategoryList")
	public String categoryListPage() {

		return "AdminSystem/CategoryList";
	}
	
	@GetMapping("/CategoryDetail")
	public String categoryDetailPage() {

		return "AdminSystem/CategoryDetail";
	}
}
