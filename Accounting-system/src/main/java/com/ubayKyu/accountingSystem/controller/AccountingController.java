package com.ubayKyu.accountingSystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ubayKyu.accountingSystem.service.LoginService;

@Controller
public class AccountingController {
	@Autowired
	HttpSession session;

	@GetMapping("/AccountingList")
	public String accountingListPage() {
		if (LoginService.CheckLoginSession(session))
			return "AdminSystem/AccountingList";
		else
			return "redirect:/Login";
	}

	@GetMapping("/AccountingDetail")
	public String accountingDetailPage() {
		if (LoginService.CheckLoginSession(session))
			return "AdminSystem/AccountingDetail";
		else
			return "redirect:/Login";
	}
}
