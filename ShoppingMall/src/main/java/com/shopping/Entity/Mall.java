package com.shopping.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//program for the Entity manager

@Entity
@Table //if we give default , it takes the class name as table name
public class Mall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private long phone_no;
	@Column
	private Integer order_id;
	public Mall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mall(Integer id, String name, String password, String email, long phone_no, Integer order_id) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone_no = phone_no;
		this.order_id = order_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
