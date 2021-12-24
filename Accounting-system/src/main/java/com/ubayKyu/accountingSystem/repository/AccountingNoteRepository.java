package com.ubayKyu.accountingSystem.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ubayKyu.accountingSystem.entity.AccountingNoteEntity;

@Repository
public interface AccountingNoteRepository extends JpaRepository<AccountingNoteEntity, Integer> {
	@Query(value = "SELECT Min(CreateDate) FROM AccountingNote", nativeQuery = true)
	LocalDateTime GetFirstAccountingNoteDate();
	
	@Query(value = "SELECT MAX(CreateDate) FROM AccountingNote", nativeQuery = true)
	LocalDateTime GetLastAccountingNoteDate();
	
	@Query(value = "SELECT Count(*) FROM AccountingNote", nativeQuery = true)
	Integer GetAccountingNoteCount();
}
