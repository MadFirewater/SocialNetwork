package com.chatingtime.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	

	public User(Object[]information) {
		super();
		this.name = (String) information[0];
		this.surname = (String) information[1];;
		this.sex = (String) information[2];
		this.location = (String) information[3];;
		this.online = (boolean) information[4];;
		this.busy = (boolean) information[5];;
		this.email = (String) information[6];;
		this.login = (String) information[7];;
		this.password = (String) information[8];
	}

	@Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="location")
	private String location;
	
	@Column(name="online")
	private boolean online;
	
	@Column(name="busy")
	private boolean busy;
	
	@Column(name="email")
	private String email;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}
	
	

}
