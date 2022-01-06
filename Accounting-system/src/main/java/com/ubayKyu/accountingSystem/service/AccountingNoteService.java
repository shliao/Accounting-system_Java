package com.ubayKyu.accountingSystem.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubayKyu.accountingSystem.repository.AccountingNoteRepository;

@Service
public class AccountingNoteService {
	@Autowired
    private AccountingNoteRepository repository;
	
	//取得第一筆流水帳紀錄
    public LocalDateTime getFirstAccountingNoteDateTime(){
        return repository.GetFirstAccountingNoteDate();
    }

    //取得最後一筆流水帳紀錄
    public LocalDateTime getLastAccountingNoteDateTime(){
        return repository.GetLastAccountingNoteDate();
    }
    
    //取得總筆數流水帳紀錄
    public int getAccountingNoteTotalCount(){
        return (int)repository.GetAccountingNoteCount();
    }
}
