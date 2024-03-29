package com.silencer.entity;
// Generated Jul 16, 2020 10:33:30 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "freydevikdb")
@NamedQueries({
	@NamedQuery(name= "Users.findAll", query= "SELECT u FROM Users u ORDER BY u.fullName"),
	@NamedQuery(name= "Users.findByEmail", query= "SELECT u FROM Users u WHERE u.email = :email"),
	@NamedQuery(name= "Users.countAll", query= "SELECT COUNT(*) FROM Users u" ),
	@NamedQuery(name= "Users.checkLogin", query= "SELECT u FROM Users u WHERE u.email = :email AND u.password = :password" )
})

public class Users implements java.io.Serializable {

	private int userId;
	private String email;
	private String fullName;
	private String password;

	public Users() {
	}

	public Users(int userId, String email, String fullName, String password) {
		this.userId = userId;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
	}
	
	public Users( String email, String fullName, String password) {
		
		this.email = email;
		this.fullName = fullName;
		this.password = password;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "email", nullable = false, length = 64)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "full_name", nullable = false, length = 128)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
