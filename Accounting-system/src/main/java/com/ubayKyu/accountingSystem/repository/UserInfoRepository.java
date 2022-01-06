package com.ubayKyu.accountingSystem.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ubayKyu.accountingSystem.entity.UserInfoEntity;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, UUID> {
	
	//取得使用者總筆數
	@Query(value = "SELECT Count(*) FROM UserInfo", nativeQuery = true)
	Integer GetUserInfoCount();
	
	//搜尋登入的使用者帳戶是否存在
	@Query(value = "SELECT * FROM UserInfo WHERE Account = :account AND PWD = :password", nativeQuery = true)
	UserInfoEntity GetUserInfoForLogin(@Param("account") String account, @Param("password") String password);
}
