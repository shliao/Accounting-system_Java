package com.ubayKyu.accountingSystem.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ubayKyu.accountingSystem.service.AccountingNoteService;
import com.ubayKyu.accountingSystem.service.UserInfoService;

@Controller
public class DefaultController {
	@Autowired
	private AccountingNoteService accountingNoteService;
	
	@Autowired
	private UserInfoService userInfoService;

	@GetMapping(value = {"/","/Default"})
	public String defaultPage(Model model) {

		LocalDateTime firstAccountingNote = accountingNoteService.getFirstAccountingNoteDateTime();
		LocalDateTime lastAccountingNote = accountingNoteService.getLastAccountingNoteDateTime();
		String first = "--", last = "--";

		if (firstAccountingNote != null && lastAccountingNote != null) {
			first = firstAccountingNote.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
			last = lastAccountingNote.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
		}

		model.addAttribute("firstAccountingNote", first)
			 .addAttribute("lastAccountingNote", last)
			 .addAttribute("accountingNoteTotalCount",accountingNoteService.getAccountingNoteTotalCount())
			 .addAttribute("userInfoTotalCount",userInfoService.getUserInfoTotalCount());

		return "Default";
	}
}
