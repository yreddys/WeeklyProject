package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Name;
	private String Email;
	private String Mobile;
	
	public Student() {
	}
	
	
	public Student(String name, String email, String mobile) {
		super();
		Name = name;
		Email = email;
		Mobile = mobile;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}


	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Mobile=" + Mobile + "]";
	}
	
	
	
}
