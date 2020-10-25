package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="Detail_Tab")
public class Detail {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="fname_col")
	private String fName;
	@Column(name="lname_col")
	private String lName;
	@Column(name="email_col")
	private String email;
	@Column(name="mobile_col")
	private String mobile;
	@Column(name="user_col")
	private String userName;
	@Column(name="pass_col")
	private String password;
	
}
