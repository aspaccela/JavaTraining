package com.everis.training.jsfee8.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Named;

@RequestScoped
@Model
@Named(value="petition")
public class Petition implements Serializable {

	private static final long serialVersionUID = -7427060704793762087L;

	private String name;
	private String telephone;
	
	private String email1;
	private String email2;
	
	public Petition() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	
}
