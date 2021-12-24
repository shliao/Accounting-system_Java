package com.ubayKyu.accountingSystem.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "AccountingNote")
@Getter @Setter
public class AccountingNoteEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", updatable = false, nullable = false)
    private Integer ID;

	@Column(name="UserID", nullable=false, columnDefinition="uniqueidentifier")
    private String UserID;
    
    @Column(name="Caption", nullable=true, columnDefinition="nvarchar(100)")
    private String Caption;
    
    @Column(name="Amount", nullable=false, columnDefinition="int")
    private Integer Amount;
    
    @Column(name="ActType", nullable=false, columnDefinition="int")
    private Integer ActType;
    
    @Column(name="CreateDate", nullable=false, columnDefinition="datetime default getdate()")
    private LocalDateTime CreateDate;
    
    @Column(name="Body", nullable=true, columnDefinition="nvarchar(500)")
    private String Body;
	
}
