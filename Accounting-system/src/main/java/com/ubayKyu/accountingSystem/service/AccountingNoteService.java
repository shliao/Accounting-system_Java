package com.ubayKyu.accountingSystem.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubayKyu.accountingSystem.repository.AccountingNoteRepository;

@Service
public class AccountingNoteService {
	@Autowired
    private AccountingNoteRepository repository;
	
    public LocalDateTime getFirstAccountingNoteDateTime(){
        return repository.GetFirstAccountingNoteDate();
    }

    public LocalDateTime getLastAccountingNoteDateTime(){
        return repository.GetLastAccountingNoteDate();
    }
    
    public int getAccountingNoteTotalCount(){
        return (int)repository.GetAccountingNoteCount();
    }
}
