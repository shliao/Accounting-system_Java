package com.ubayKyu.accountingSystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ubayKyu.accountingSystem.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	HttpSession session;

	@Autowired
	private LoginService loginService;

	@GetMapping("/Login")
	public String loginPage() {
		if (LoginService.CheckLoginSession(session))
			return "redirect:/UserProfile";
		else
			return "Login";
	}

	@PostMapping("/Login")
	public String login(Model model, @RequestParam("account") String account, @RequestParam("password") String password,
			RedirectAttributes redirectAttrs) {

		boolean checkLogin = loginService.TryLogin(account, password);

		if (checkLogin == true) {
			return "redirect:/UserProfile";
		} else {
			redirectAttrs.addFlashAttribute("loginErrorMessage", "登入失敗，請檢查帳號、密碼是否正確。");
			return "redirect:/Login";
		}
	}

	//登出並且清空使用者登入資訊
	@GetMapping("/Logout")
	public String logout(Model model, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("message", "已成功登出，將您導回預設頁");
		LoginService.RemoveLoginSession(session);
		return "redirect:/Default";
	}
}
