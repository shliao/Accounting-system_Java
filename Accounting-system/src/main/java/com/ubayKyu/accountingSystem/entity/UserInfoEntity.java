package com.ubayKyu.accountingSystem.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "UserInfo")
@Getter
@Setter
public class UserInfoEntity {
	@Id
	@GeneratedValue(generator = "UUID", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", updatable = false, nullable = false, columnDefinition = "uniqueidentifier")
	private UUID ID;

	@Column(name = "Account", nullable = false, columnDefinition = "varchar(50)")
	private String Account;

	@Column(name = "PWD", nullable = false, columnDefinition = "varchar(50)")
	private String PWD;

	@Column(name = "PWDsalt", nullable = true, columnDefinition = "varchar(50)")
	private String PWDsalt;
	
	@Column(name = "PWDEncrypt", nullable = true, columnDefinition = "varchar(100)")
	private String PWDEncrypt;
	
	@Column(name = "Name", nullable = false, columnDefinition = "nvarchar(50)")
	private String Name;

	@Column(name = "NameEncrypt", nullable = true, columnDefinition = "nvarchar(100)")
	private String NameEncrypt;
	
	@Column(name = "Email", nullable = false, columnDefinition = "nvarchar(100)")
	private String Email;

	@Column(name = "UserLevel", nullable = false)
	private Integer UserLevel;

	@Column(name = "CreateDate", nullable = false, columnDefinition = "datetime")
	private LocalDateTime CreateDate;
}
