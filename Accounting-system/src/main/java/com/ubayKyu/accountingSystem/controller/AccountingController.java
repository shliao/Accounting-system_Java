package com.ubayKyu.accountingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountingController {
	@GetMapping("/AccountingList")
	public String accountingListPage() {

		return "AdminSystem/AccountingList";
	}

	@GetMapping("/AccountingDetail")
	public String accountingDetailPage() {

		return "AdminSystem/AccountingDetail";
	}
}
