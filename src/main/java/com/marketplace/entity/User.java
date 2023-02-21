package com.marketplace.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
public class User {

	@Id
	private Long id;
	private String first_name;
	private String last_name;
	private String username;
	private String nickname;
	private String birthday;
	private String birthplace;
	private String fonction;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getBirthplace() {
		return birthplace;
	}


	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String first_name, String last_name, String username, String nickname, String birthday,
			String birthplace, String fonction) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.nickname = nickname;
		this.birthday = birthday;
		this.birthplace = birthplace;
		this.fonction = fonction;
	}

}
