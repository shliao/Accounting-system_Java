package com.ubayKyu.accountingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubayKyu.accountingSystem.repository.UserInfoRepository;

@Service
public class UserInfoService {
	@Autowired
	private UserInfoRepository repository;

	public int getUserInfoTotalCount() {
		return (int) repository.GetUserInfoCount();
	}

//	public List<UserInfo> getUserInfos(){
//		return repository.findAll();
//	}
//	
//	//test
//	public UserInfo saveUserInfo(UserInfo UserInfo) {
//		return repository.save(UserInfo);
//	}
//	
//	public List<UserInfo> getUserInfoById(List<Integer> ids){
//		return repository.findAllById(ids);
//	}
//	
//	public String deleteUserInfo(int id) {
//		repository.deleteById(id);
//		return "Deleted!";
//	}
}
