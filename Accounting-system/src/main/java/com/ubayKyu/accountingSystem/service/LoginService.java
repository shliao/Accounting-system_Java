package com.ubayKyu.accountingSystem.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubayKyu.accountingSystem.entity.UserInfoEntity;

@Service
public class LoginService {
	@Autowired
	HttpSession session;

	@Autowired
	private UserInfoService userInfoService;

	//嘗試登入使用者帳戶
	public boolean TryLogin(String inputAccount, String inputPassword) {
		boolean boolLogin = false;

		UserInfoEntity user = userInfoService.getUserInfo(inputAccount, inputPassword);
		
		if (user != null) {
			boolLogin = true;
			session.setAttribute("userLoginInfo", user);
		}
		return boolLogin;
	}
	
	//移除登入使用者資訊
	public static void RemoveLoginSession(HttpSession session)
	{
		session.removeAttribute("userLoginInfo");
	}

	//檢查登入使用者資訊
	public static boolean CheckLoginSession(HttpSession session)
	{
		Object isExist = session.getAttribute("userLoginInfo");
		
		if(isExist != null)
			return true;
		else
			return false;
	}
}
