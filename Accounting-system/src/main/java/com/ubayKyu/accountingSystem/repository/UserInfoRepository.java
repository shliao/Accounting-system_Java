package com.ubayKyu.accountingSystem.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ubayKyu.accountingSystem.entity.UserInfoEntity;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, UUID> {
	@Query(value = "SELECT Count(*) FROM UserInfo", nativeQuery = true)
	Integer GetUserInfoCount();
}
