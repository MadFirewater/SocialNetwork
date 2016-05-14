package com.chatingtime.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "private messages")
public class PrivateMessage {
	@Id
    @Column(name= "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "sender_id")
	User sender;
	
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "receiver_id")
	User receiver;
	
	@Column(name= "text")
	String text;
	
	@Column(name= "date")
	Date date;
	
	@Column(name= "time")
	Time time;
	
	
}
